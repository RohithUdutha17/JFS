package com.model;

public class CallQualityDetailsV2 {

	private String callType;
	private String minimumDropRate;
	private String maximumDropRate;
	private String callDuration;
	private String sourceLocation;
	private String destinationLocation;
	
	public CallQualityDetailsV2() {}
	
	public CallQualityDetailsV2(String callType, String minimumDropRate, String maximumDropRate, String callDuration,
			String sourceLocation, String destinationLocation) {
		super();
		this.callType = callType;
		this.minimumDropRate = minimumDropRate;
		this.maximumDropRate = maximumDropRate;
		this.callDuration = callDuration;
		this.sourceLocation = sourceLocation;
		this.destinationLocation = destinationLocation;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getMinimumDropRate() {
		return minimumDropRate;
	}
	public void setMinimumDropRate(String minimumDropRate) {
		this.minimumDropRate = minimumDropRate;
	}
	public String getMaximumDropRate() {
		return maximumDropRate;
	}
	public void setMaximumDropRate(String maximumDropRate) {
		this.maximumDropRate = maximumDropRate;
	}
	public String getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	@Override
	public String toString() {
		return "CallQualityDetailsV2 [callType=" + callType + ", minimumDropRate=" + minimumDropRate
				+ ", maximumDropRate=" + maximumDropRate + ", callDuration=" + callDuration + ", sourceLocation="
				+ sourceLocation + ", destinationLocation=" + destinationLocation + "]";
	}
	
	
}
