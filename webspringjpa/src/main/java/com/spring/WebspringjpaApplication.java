package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.spring.controller"})
public class WebspringjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebspringjpaApplication.class, args);
	}

}
