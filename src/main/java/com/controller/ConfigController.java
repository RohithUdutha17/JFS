package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${user.role}")
	private String role;
	
	@GetMapping("/role")
	public String getRole() {
		return "Your role is :"+role;
	}
}
