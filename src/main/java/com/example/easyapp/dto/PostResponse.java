package com.example.easyapp.dto;

import lombok.Data;

/**
 * サンプルPOSTレスポンスです。
 * 
 * @author nob
 */
@Data
public class PostResponse {

    /** 認証の成否 */
    private Boolean isAuthorized;

    /** 認可コード */
    private String authorizationCode;
}
