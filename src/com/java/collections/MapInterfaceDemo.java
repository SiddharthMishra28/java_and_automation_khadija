package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {
	public static void main(String[] args) {
//		Map<Integer, String> myMap = new HashMap<>();
//		myMap.put(91, "India");
//		myMap.put(64, "UK");
//		myMap.put(1, "US");
//		System.out.println(myMap);
//		System.out.println(myMap.get(64));
		
		Map<String, String> CitiesAndStates = new HashMap<>();
		CitiesAndStates.put("Mumbai", "Maharashtra");
		CitiesAndStates.put("Pune", "Maharashtra");
		CitiesAndStates.put("Bangalore", "Karnataka");
		System.out.println(CitiesAndStates);
		CitiesAndStates.put("Pune", "India");
		System.out.println(CitiesAndStates);
	}
}
