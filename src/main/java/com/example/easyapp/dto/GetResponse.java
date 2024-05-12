package com.example.easyapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * サンプルGETレスポンスです。
 * 
 * @author nob
 */
@Data
@Schema(description = "サンプルGETレスポンス", type = "object")
public class GetResponse {

    /** 名前 */
    @Schema(description = "名前", type = "string", example = "nob")
    private String name;

    /** メッセージ */
    @Schema(description = "メッセージ", type = "string", example = "Hello, nob!")
    private String message;
}
