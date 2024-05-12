package com.example.easyapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * サンプルPOSTリクエストです。
 * 
 * @author nob
 */
@Data
@Schema(description = "サンプルPOSTリクエスト", type = "object")
public class PostRequest {

    /** ユーザID */
    @NotNull
    @Schema(description = "ユーザID", type = "string", example = "nob")
    private String userId;

    /** パスワード */
    @NotNull
    @Schema(description = "パスワード", type = "string", example = "p@ssw0rd")
    private String password;

    /** 年齢 */
    @Size(min = 18, max = 22)
    @Schema(description = "年齢", type = "string", example = "20")
    private Integer age;
}
