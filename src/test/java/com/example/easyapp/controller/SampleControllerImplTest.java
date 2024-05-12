package com.example.easyapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.easyapp.dto.GetRequest;
import com.example.easyapp.dto.PostRequest;
import com.example.easyapp.dto.RedirectRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.queryParameters;

/**
 * サンプルコントローラーのテストクラスです。
 * 
 * @author nob
 */
@WebMvcTest(SampleController.class)
@AutoConfigureRestDocs(outputDir = "target/snippets")
public class SampleControllerImplTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * getメソッドのテスト 正常系
     * 
     * @throws Exception
     */
    @Test
    public void test_get_success() throws Exception {

        GetRequest getRequest = new GetRequest();
        getRequest.setName("nob");

        this.mockMvc
                .perform(get("/sample/get").queryParam("name", getRequest.getName()))
                .andExpect(status().isOk())
                .andDo(document("doctest/get",
                        queryParameters(parameterWithName("name").description("名前"))));
    }

    /**
     * postメソッドのテスト 正常系
     * 
     * @throws Exception
     */
    @Test
    public void test_post_success() throws Exception {

        PostRequest postRequest = new PostRequest();
        postRequest.setUserId("nob");
        postRequest.setPassword("p@ssw0rd");

        ObjectMapper objectMapper = new ObjectMapper();

        this.mockMvc
                .perform(post("/sample/post").content(objectMapper.writeValueAsString(postRequest))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andDo(document("doctest/post",
                        requestFields(fieldWithPath("userId").description("ユーザID"),
                                fieldWithPath("password").description("パスワード")),
                        responseFields(
                                fieldWithPath("isAuthorized").description("認証の成否"),
                                fieldWithPath("authorizationCode").description("認可コード"))));
    }

    /**
     * redirectメソッドのテスト 正常系
     * 
     * @throws Exception
     */
    @Test
    public void test_redirect_success() throws Exception {

        RedirectRequest redirectRequest = new RedirectRequest();
        redirectRequest.setSampleValue("sample");

        this.mockMvc.perform(get("/sample/redirect").queryParam("sampleValue", redirectRequest.getSampleValue()))
                .andExpect(status().isFound())
                .andExpect(view().name("redirect:https://www.google.com/?sample_value=sample"))
                .andDo(document("doctest/redirect",
                        queryParameters(parameterWithName("sampleValue").description("サンプルのクエリパラメータ"))));
    }
}
