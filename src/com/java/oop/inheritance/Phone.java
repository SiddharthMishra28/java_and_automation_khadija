package com.java.oop.inheritance;

public class Phone {
	
	float screenSize;
	String os;
	int ramCapacity;
	String networkType;
	
	// Methods or Functions in java
	// <ACCESS SPECIFIER> <RETURN TYPE> <NAME OF METHOD/ FUNCTION>(arguments..) {
	// .... Reusable piece of code
	// ....
	// }
	// Reusable behavior
	public void switchPhoneOn() {
		if(os.equalsIgnoreCase("IOS")) {
			System.out.println("APPLE LOGO...");
		}else {
			System.out.println("Welcome to Android...");
		}
	}
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		iphone.screenSize = 5.6f;
		iphone.os = "IOS";
		iphone.ramCapacity = 4;
		iphone.networkType = "4G";
//		iphone.switchPhoneOn();
		// iphone is an object of type Phone created as a blueprint/ class above
		
		Phone samsungGalaxyPhone = new Phone();
		samsungGalaxyPhone.screenSize = 7f;
		samsungGalaxyPhone.os = "Android";
		samsungGalaxyPhone.ramCapacity = 6;
		samsungGalaxyPhone.networkType = "5G";
		samsungGalaxyPhone.switchPhoneOn();
	}
}
