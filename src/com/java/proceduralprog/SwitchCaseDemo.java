package com.java.proceduralprog;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		// switch(<EVALUATION>){
		// case "<MATCH">:
		// ...
		// case "<MATCH 2>":
		// ....
		// default:
		// ...
		// }
		System.out.println("Smart home");
		System.out.println("Select option from below menu");
		System.out.println("1. unlock main door");
		System.out.println("2. lights and electrification");
		System.out.println("3. smart controls");
		int option = 1;
		switch(option) {
		case 1:
			System.out.println("Welcome to door lock / unlock system");
			break;
		case 2:
			System.out.println("Enter room number to control electricals");
			break;
		case 3:
			System.out.println("Welcome to smart mobile controls");
			break;
		default:
			System.out.println("Invalid value entered!");
		}
		
	}
}
