package com.example.easyapp.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * サンプルPOSTリクエストです。
 * 
 * @author nob
 */
@Data
public class PostRequest {

    /** ユーザID */
    @NotNull
    private String userId;

    /** パスワード */
    @NotNull
    private String password;
}
