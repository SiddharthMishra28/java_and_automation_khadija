package com.java.proceduralprog;

public class NestedIfStatementsDemo {
	public static void main(String[] args) {
		// Bank
		// KYC
		// SSN - Southern
		// ---   // if senior citizen > 60
		// ---- // if < 30 
		String zone = "North";
		int age = 45;
		if(zone.equals("South")) {
			// ALL RULES FOR SOUTH CHECKS
			if(age >= 60) {
				System.out.println("Senior Citizen Rules applicable");
			}else if(age < 60 && age > 30) {
				System.out.println("Working citizen Rules applicable");
			}else {
				System.out.println("Student rules applicable");
			}
		}else if(zone.equals("East")) {
			// ALL RULES FOR EAST CHECK
		}else {
			// DEFAULT RULES
			System.out.println("Default rules Applicable");
		}
	}
}
