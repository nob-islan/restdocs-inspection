package com.example.easyapp.dto;

import lombok.Data;

/**
 * サンプルGETレスポンスです。
 * 
 * @author nob
 */
@Data
public class GetResponse {

    /** 名前 */
    private String name;

    /** メッセージ */
    private String message;
}
