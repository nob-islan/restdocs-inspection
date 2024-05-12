package com.example.easyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "サンプルAPI仕様書", version = "1.0.0", description = "サンプルAPI群の仕様書です。"))
public class EasyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyAppApplication.class, args);
	}

}
