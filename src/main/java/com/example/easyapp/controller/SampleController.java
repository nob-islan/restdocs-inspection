package com.example.easyapp.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easyapp.dto.GetRequest;
import com.example.easyapp.dto.GetResponse;
import com.example.easyapp.dto.PostRequest;
import com.example.easyapp.dto.PostResponse;

/**
 * サンプルコントローラのインターフェースです。
 * 
 * @author nob
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/sample")
public interface SampleController {

    /**
     * サンプルのGETメソッドです。入力された名前に対してメッセージを返します。
     * 
     * @param getRequest メッセージ表示に使われる名前を格納するモデルです。nullを許可しません。
     * @return あいさつ用メッセージ
     */
    @GetMapping(value = "/get")
    GetResponse get(GetRequest getRequest);

    /**
     * サンプルのPOSTメソッドです。入力されたクレデンシャル情報を検証し、認証の成否を返します。
     * 
     * @param postRequest ユーザIDおよびパスワード
     * @return 認証の成否 認証成功の場合は認可コード
     */
    @PostMapping(value = "/post")
    PostResponse post(@RequestBody @Valid PostRequest postRequest);
}
