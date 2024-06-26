package com.example.easyapp.controller.impl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.easyapp.controller.SampleController;
import com.example.easyapp.dto.GetRequest;
import com.example.easyapp.dto.GetResponse;
import com.example.easyapp.dto.PostRequest;
import com.example.easyapp.dto.PostResponse;

/**
 * サンプルコントローラの実装です。
 * 
 * @author nob
 * @version 1.0
 */
@RestController
public class SampleControllerImpl implements SampleController {

    /**
     * {@inheritDoc}
     */
    @Override
    public GetResponse get(GetRequest getRequest) {

        GetResponse getResponse = new GetResponse();
        getResponse.setName(getRequest.getName());
        getResponse.setMessage("Hello, " + getRequest.getName() + "!");

        return getResponse;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostResponse post(PostRequest postRequest) {

        PostResponse postResponse = new PostResponse();
        postResponse.setIsAuthorized(true);
        postResponse.setAuthorizationCode("abc123");

        return postResponse;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModelAndView redirect() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView
                .setViewName("redirect:https://www.google.com/");

        return modelAndView;
    }
}
