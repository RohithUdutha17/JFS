package com.versioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.model","com.controller"})
public class VersioningApplication {

	public static void main(String[] args) {
		SpringApplication.run(VersioningApplication.class, args);
	}

}
