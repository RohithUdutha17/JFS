package com.model;

public class ItemNotFoundException extends Exception{
	
	private String message;
	
	public ItemNotFoundException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "Error : "+ message;
	}
}
