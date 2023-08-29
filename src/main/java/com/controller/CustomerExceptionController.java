package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.model.LengthNotAppropriateException;

@ControllerAdvice
public class CustomerExceptionController {

	@ExceptionHandler(LengthNotAppropriateException.class)
	public ResponseEntity<String> exception(LengthNotAppropriateException e){
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}
}
