package com.java.oop.polymorphism;

public class Vehicle {
	
	String make;
	String engineCapacity;
	public String name; // Accessible in entire project
	protected String serialNumber; // Accessible only in this class or its childrens
	
	public Vehicle() {
		System.out.println("Vehicle Instance Created!");
	}
	
	public void startVehicle() {
		System.out.println("Vehicle Started!");
	}
	
	public void stopVehicle() {
		System.out.println("Vehicle Stopped!");
	}
	
	public void move(int speed) {
		System.out.println("Vehicle Moving at "+speed+" km/hr");
	}
	
	// Method Overloading
	public void move(int speed, int gear) {
		System.out.println("Vehicle Moving at "+speed+" km/hr and tuning to gear "+gear);
	}
}
