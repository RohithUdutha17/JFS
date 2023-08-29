package com.service;

import org.springframework.stereotype.Service;

@Service
public class EurekaServiceDemo {

	public boolean checkUserName(String username) {
		if(username.length()<10)
			return false;
		return true;
	}
	
	public double calSimpleInterest(double p,double r,double t) {
		System.out.println(p+" "+r+" "+t);
		return (p*r*t)/100;
	}
}
