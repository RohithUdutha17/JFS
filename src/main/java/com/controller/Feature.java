package com.controller;

import org.springframework.stereotype.Component;

@Component
public class Feature {
	
	private Boolean enabled;
	private String featureName;
	private String featureType;
	
	public Feature() {}
	
	public Feature(Boolean enabled, String featureName, String featureType) {
		super();
		this.enabled = enabled;
		this.featureName = featureName;
		this.featureType = featureType;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getFeatureType() {
		return featureType;
	}
	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}
	@Override
	public String toString() {
		return "Features [enabled=" + enabled + ", featureName=" + featureName + ", featureType=" + featureType + "]";
	}
	
	
}
