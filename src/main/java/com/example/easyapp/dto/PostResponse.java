package com.example.easyapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * サンプルPOSTレスポンスです。
 * 
 * @author nob
 */
@Data
@Schema(description = "サンプルPOSTレスポンス", type = "object")
public class PostResponse {

    /** 認証の成否 */
    @Schema(description = "認証の成否", type = "boolean", example = "true")
    private Boolean isAuthorized;

    /** 認可コード */
    @Schema(description = "認可コード", type = "string", example = "abc123")
    private String authorizationCode;
}
