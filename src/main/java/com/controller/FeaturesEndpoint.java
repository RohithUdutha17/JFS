package com.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="features")
public class FeaturesEndpoint {

	private Map<String,Feature> features = new ConcurrentHashMap<>();
	
	public FeaturesEndpoint() {
		features.put("feature1", new Feature(true,"first","login"));
		features.put("feature2", new Feature(true,"second","register"));
		features.put("feature3", new Feature(true,"third","home"));
	}
	
	@ReadOperation
	public Map<String,Feature> getFeatures(){
		return features;
	}
	
//	@ReadOperation
//	public Feature getFeature(String name) {
//		return features.get(name);
//	}
	
	@WriteOperation
	public WebEndpointResponse<Feature> addFeature(String featureName,String featureType){
		
		Feature feature = new Feature(true,featureName,featureType);
		features.put("feature", feature);
		
		return new WebEndpointResponse(feature);
	}
	
	@DeleteOperation
	public void deleteFeature(@Selector String featureName) {
		features.remove(featureName);
	}
}
