package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
	public static void main(String[] args) {
		Set<String> myData = new HashSet<>();
		myData.add("Sid");
		myData.add("shareek");
		myData.add("khadija");
		myData.add("Sid");
		myData.add("shareek");
		myData.add("khadija");
		myData.add("Sid");
		myData.add("shareek");
		myData.add("khadija");
		myData.add("Sid");
		myData.add("shareek");
		myData.add("khadija");
		System.out.println(myData);
	}
}
