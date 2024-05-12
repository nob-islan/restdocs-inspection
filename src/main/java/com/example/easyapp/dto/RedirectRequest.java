package com.example.easyapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * サンプルリダイレクトリクエストです。
 * 
 * @author nob
 */
@Data
@Schema(description = "サンプルリダイレクトリクエスト", type = "object")
public class RedirectRequest {

    /** サンプルクエリパラメータ */
    @Schema(description = "サンプルクエリパラメータ", type = "string", example = "sample")
    private String sampleValue;
}
