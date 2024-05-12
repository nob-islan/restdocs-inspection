package com.example.easyapp.controller;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.easyapp.dto.GetRequest;
import com.example.easyapp.dto.GetResponse;
import com.example.easyapp.dto.PostRequest;
import com.example.easyapp.dto.PostResponse;
import com.example.easyapp.dto.RedirectRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

/**
 * サンプルコントローラのインターフェースです。
 * 
 * @author nob
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/sample")
@Tag(name = "Sample", description = "サンプルAPIです。")
public interface SampleController {

    /**
     * サンプルのGETメソッドです。入力された名前に対してメッセージを返します。
     * 
     * @param getRequest メッセージ表示に使われる名前を格納するモデルです。nullを許可しません。
     * @return あいさつ用メッセージ
     */
    @GetMapping(value = "/get")
    @Operation(summary = "Sample get", description = "${sampleapidoc.describe.sample.get:説明文}")
    GetResponse get(@ParameterObject GetRequest getRequest);

    /**
     * サンプルのPOSTメソッドです。入力されたクレデンシャル情報を検証し、認証の成否を返します。
     * 
     * @param postRequest ユーザIDおよびパスワード
     * @return 認証の成否 認証成功の場合は認可コード
     */
    @PostMapping(value = "/post")
    @Operation(summary = "Sample post", description = "${sampleapidoc.describe.sample.post:説明文}")
    PostResponse post(@RequestBody @Valid PostRequest postRequest);

    /**
     * サンプルのリダイレクトです。googleトップページにリダイレクトします。
     * 
     * @param redirectRequest リダイレクトURI
     * @return googleトップページ
     */
    @GetMapping(value = "/redirect")
    @Operation(summary = "Sample redirect", description = "${sampleapidoc.describe.sample.get:説明文}")
    ModelAndView redirect(@ParameterObject RedirectRequest redirectRequest);
}
