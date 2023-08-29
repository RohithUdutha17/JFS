package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.model.LengthNotAppropriateException;

@RestController
public class CustomerController {

	
	@PostMapping("/addcustomer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer c) throws LengthNotAppropriateException{
		if(c.getFirstName().length() < 3) {
			throw new LengthNotAppropriateException("firstname length should be greater than 3");
		}
		return new ResponseEntity<>("Customer added",HttpStatus.CREATED);
	}
}
