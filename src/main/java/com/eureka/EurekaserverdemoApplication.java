package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = {"com.controller","com.service"})
@EnableEurekaServer
public class EurekaserverdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverdemoApplication.class, args);
	}

}
