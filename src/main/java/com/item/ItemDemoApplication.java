package com.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.controller","com.service"})
public class ItemDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemDemoApplication.class, args);
	}

}
