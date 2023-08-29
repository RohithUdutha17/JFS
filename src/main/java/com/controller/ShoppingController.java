package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.cloud.sleuth.annotation.TagValueResolver;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/")
	@NewSpan(name="myspan")
	public String hello(@SpanTag(key="testtag",resolver=TagValueResolver.class) String param) {
		return "hello from app";
	}
	
	@GetMapping("/viewitems")
	public ResponseEntity<?> getItems(){
		String url = "http://localhost:9025/items";
		
		ResponseEntity<List<Object>> response  = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Object>>() {});
		return response;
		
	}
}
