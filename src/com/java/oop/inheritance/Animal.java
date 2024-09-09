package com.java.oop.inheritance;

public class Animal {
	
	String scientificName;
	String species;
	String weight;
	String height;
	
	//CONSTRUCTOR
	public Animal() {
		System.out.println("Created a new Animal!");
	}
	
	public void makeSound() {
		System.out.println("Animal "+species+" is making sound!");
	}
}
