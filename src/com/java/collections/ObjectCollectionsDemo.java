package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class ObjectCollectionsDemo {
	public static void main(String[] args) {
		Address a1 = new Address();
		a1.setHouseNo("1101");
		Address a2 = new Address();
		a2.setHouseNo("B-345");
		Employee e1 = new Employee(1, "sid", "mishra", "9283847561", "sid@test.com", a1);
		Employee e2 = new Employee(2, "Khadija", "Fikri", "320380138", "khadija@test.com", a2);
//		List<Employee> employees = new ArrayList<>();
//		employees.add(e1);
//		employees.add(e2);
//		System.out.println(employees);
		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(1, e1);
		employeeMap.put(2, e2);
		System.out.println(employeeMap);
	}
}
