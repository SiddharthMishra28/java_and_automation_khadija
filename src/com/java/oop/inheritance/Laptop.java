package com.java.oop.inheritance;

public class Laptop {
	
	// Inheritance
	// Polymorphism
	// Abstraction
	// Encapsulation
	
	int screenSize;
	int ramCapacity;
	int hardDiskCapacity;
	String make;
	String model;
	
	void checkCompatibility(String os) {
		if(os.equalsIgnoreCase("windows")) {
			System.out.println("Ram Capacity required is 2GB");
		}else if(os.equalsIgnoreCase("Linux")) {
			System.out.println("Ram Capacity required is 512 MB");
		}
	}
	
	double checkHardDriveFreeSpace(String os) {
		if(os.equalsIgnoreCase("windows")) {
			return hardDiskCapacity * 0.9;
		}else if(os.equalsIgnoreCase("linux")) {
			return hardDiskCapacity * 0.95;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Laptop lenovoLaptop = new Laptop();
		lenovoLaptop.screenSize = 16;
		lenovoLaptop.hardDiskCapacity = 1000;
		lenovoLaptop.checkCompatibility("windows");
		double freeSpace = lenovoLaptop.checkHardDriveFreeSpace("windows");
		System.out.println(freeSpace);
	}
}
