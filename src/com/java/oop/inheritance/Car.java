package com.java.oop.inheritance;

// INHERITANCE
public class Car extends Vehicle {
	
	String model;
	
	public static void main(String[] args) {
		Car mercedes = new Car();
		mercedes.startVehicle();
	}
}
