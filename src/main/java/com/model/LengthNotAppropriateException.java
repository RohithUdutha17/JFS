package com.model;

public class LengthNotAppropriateException extends Exception {

	String message;
	
	public LengthNotAppropriateException() {}
	
	public LengthNotAppropriateException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "Error :"+ message;
	}
}
