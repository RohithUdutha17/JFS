package com.exceptionhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.controller","com.model"})
public class ExceptionhandlingdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionhandlingdemoApplication.class, args);
	}

}
