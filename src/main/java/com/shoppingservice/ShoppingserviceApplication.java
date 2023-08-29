package com.shoppingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.annotation.TagValueResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.controller"})
public class ShoppingserviceApplication {

	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean 
	TagValueResolver getResolver()
	{
		return parameter->"time taken:"+new java.util.Date().getTime();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ShoppingserviceApplication.class, args);
	}

}
