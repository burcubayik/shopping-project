package com.example.shoppingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestControllerAdvice
public class ShoppingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingDemoApplication.class, args);
	}

}
