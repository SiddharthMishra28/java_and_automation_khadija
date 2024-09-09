package com.java.oop.abstraction;

public class Vodafone extends GSM {

	public static void main(String[] args) {
		Vodafone vf = new Vodafone();
		vf.registerNetwork();
	}

	@Override
	public void switchFrequency() {
		System.out.println("Switching to frequency 1900Mhz");
	}
	
	// CREATE A ABSTRACT CLASS CALLED AS BILLING
	// CREATE A CLASS CALLED AS MARKET
	// MARKET SHOULD EXTEND BILLING
	// DECLARE NON-ABSTRACT AND ABSTRACT METHODS ON BILLING
	// IMPLEMENT THE DISCOUNT LOGIN ON MARKET CLASS
	// SHOW FINAL BILL POST DISCOUNT TO CUSTOMER
}
