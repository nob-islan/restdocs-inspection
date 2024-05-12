package com.example.easyapp.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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

    /** 年齢 */
    @Min(value = 18)
    @Max(value = 22)
    private Integer age;
}
