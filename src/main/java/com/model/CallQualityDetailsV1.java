package com.model;

public class CallQualityDetailsV1 {
	
	private String callType;
	private String minimumDropRate;
	private String maximumDropRate;
	private String callDuration;
	
	public CallQualityDetailsV1() {}
	
	public CallQualityDetailsV1(String callType, String minimumDropRate, String maximumDropRate, String callDuration) {
		super();
		this.callType = callType;
		this.minimumDropRate = minimumDropRate;
		this.maximumDropRate = maximumDropRate;
		this.callDuration = callDuration;
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
	@Override
	public String toString() {
		return "CallQuailityDetailsV1 [callType=" + callType + ", minimumDropRate=" + minimumDropRate
				+ ", maximumDropRate=" + maximumDropRate + ", callDuration=" + callDuration + "]";
	}
	
}
