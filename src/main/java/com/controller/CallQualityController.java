package com.controller;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.*;

@RestController
public class CallQualityController {

	ArrayList<CallQualityDetailsV1> list1 = new ArrayList<>();
	ArrayList<CallQualityDetailsV2> list2 = new ArrayList<>();
	
	public CallQualityController() {
		list1.add(new CallQualityDetailsV1("abc","3","9","10"));
		list1.add(new CallQualityDetailsV1("akc","4","8","15"));
		
		list2.add(new CallQualityDetailsV2("abc","3","9","10","hyd","mum"));
		list2.add(new CallQualityDetailsV2("abc","3","9","10","mum","hyd"));
	}
	
	@GetMapping("/callquality/v1")
	public ArrayList<CallQualityDetailsV1> getCallQualityV1ThroughURI(){
		return list1;
	}
	
	@GetMapping("/callquality/v2")
	public ArrayList<CallQualityDetailsV2> getCallQualityV2ThroughURI(){
		return list2;
	}
	
	@GetMapping(value="/callquality/param",params="version=1")
	public ArrayList<CallQualityDetailsV1> getCallQualityV1ThroughParam(){
		return list1;
	}
	
	@GetMapping(value="/callquality/param",params="version=2")
	public ArrayList<CallQualityDetailsV2> getCallQualityV2ThroughParam(){
		return list2;
	}
	
	@GetMapping(value="/callquality",headers="X-API-VERSION=1")
	public ArrayList<CallQualityDetailsV1> getCallQualityV1ThroughHeaders(){
		return list1;
	}
	
	@GetMapping(value="/callquality",headers="X-API-VERSION=2")
	public ArrayList<CallQualityDetailsV2> getCallQualityV2ThroughHeaders(){
		return list2;
	}
	
	@GetMapping(value="/callquality",produces="application/call.quality.app-v1+json")
	public ArrayList<CallQualityDetailsV1> getCallQualityV1(){
		return list1;
	}
	
	@GetMapping(value="/callquality",produces="application/call.quality.app-v2+json")
	public ArrayList<CallQualityDetailsV2> getCallQualityV2(){
		return list2;
	}
}
