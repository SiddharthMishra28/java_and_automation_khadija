package com.java.oop.inheritance;

public class Dog extends Animal {
	
	String type;
	String genre;
	
	// Doesn't return anything! its invoked on object creation
	public Dog() {
		System.out.println("Animal of type Dog created!");
	}
	
	public void move() {
		System.out.println("Dog of type "+type+" is moving!");
	}
	
	public static void main(String[] args) {
		Dog pomerian = new Dog();
//		pomerian.species = "Homo sapiens";
//		pomerian.type = "Non Trivial";
//		pomerian.makeSound();
		
//		Animal labrador = new Animal(); // Java automatically creates a default constructor if u dont declare one
//		Animal labrador2 = new Dog();
//		Dog labrador3 = new Animal(); NOT PERMITTED! Cannot assign child to parent class
		
	}
}
