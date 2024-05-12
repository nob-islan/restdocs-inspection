package com.example.easyapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * サンプルGETリクエストです。
 * 
 * @author nob
 */
@Data
@Schema(description = "サンプルGETリクエスト", type = "object")
public class GetRequest {

    /** 名前 */
    @Schema(description = "名前", type = "string", example = "nob")
    private String name;
}
