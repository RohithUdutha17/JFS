package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.EurekaServiceDemo;

@RestController
public class EurekaControllerDemo {

	@Autowired
	EurekaServiceDemo eurekaServiceDemo;
	
	@GetMapping("/user/{username}")
	public ResponseEntity<String> checkUserName(@PathVariable String username){
		if(eurekaServiceDemo.checkUserName(username)) {
			return new ResponseEntity<>("Username is correct",HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<>("username is invalid",HttpStatus.NOT_ACCEPTABLE);
		}	
	}
	
	@GetMapping("/simpleinterest/{data}")
	public ResponseEntity<Double> calsimpleInterest(@PathVariable String data ){
		String[] arr = data.split(",");
		double principle = Double.parseDouble(arr[0]);
		double rate = Double.parseDouble(arr[1]);
		double time = Double.parseDouble(arr[2]);
		return new ResponseEntity<>(eurekaServiceDemo.calSimpleInterest(principle,rate,time),HttpStatus.OK);
	}
	
}
