package com.java.oop.polymorphism;

public class Car extends Vehicle{
	
	String model;
	String type;
	
	// Method Overriding
	public void startVehicle() {
		System.out.println("Vehicle "+model+" started!");
	}
	
	public static void main(String[] args) {
		Car audi = new Car();
		audi.model = "Audi R8";
		audi.startVehicle();
		audi.move(60, 2);
	}
}
