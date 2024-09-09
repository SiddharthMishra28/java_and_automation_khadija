package com.java.oop.abstraction;

public abstract class GSM {
	
	String countryCode;
	String channelFrequency;
	String networkCarrier;
	
	public void registerNetwork() {
		System.out.println("Registering....");
		System.out.println("Registered to network "+networkCarrier);
	}
	
	public abstract void switchFrequency();
}
