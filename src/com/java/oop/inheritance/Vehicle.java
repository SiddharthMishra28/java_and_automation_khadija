package com.java.oop.inheritance;

public class Vehicle {
	
	String make;
	String type;
	String engineCapacity;
	String numGears;

	void startVehicle() {
		System.out.println("Vehicle Started!!");
	}
	
	void stopVehicle() {
		System.out.println("Vehicle Stopped!!");
	}
	
	public static void main(String[] args) {
		Vehicle bus = new Vehicle();
		bus.startVehicle();
		bus.stopVehicle();
	}
}
