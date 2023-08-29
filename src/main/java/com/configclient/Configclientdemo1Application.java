package com.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.controller"})
public class Configclientdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configclientdemo1Application.class, args);
	}

}
