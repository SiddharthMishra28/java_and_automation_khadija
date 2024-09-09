package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
	
	public static void main(String[] args) {
		List<String> employees = new ArrayList<>();
		employees.add("Sid"); //0
		employees.add("shareek"); //1
		employees.add("khadija"); //2
		employees.add("Sid");
		employees.add("shareek");
		employees.add("khadija");
		employees.add("Sid");
		employees.add("shareek");
		employees.add("khadija");
		employees.add("Sid");
		employees.add("shareek");
		employees.add("khadija");
//		System.out.println(employees.get(6));
		
		employees.add(3, "Ansh");
		if(employees.contains("Ansh")) {
			System.out.println("Record Inserted!");
		}
	}
}
