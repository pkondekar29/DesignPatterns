package com.learnings.designPatterns.structural.adapter;

import java.util.List;

public class Driver {

	public static void main(String[] args) {
		EmployeeClient employeeClient = new EmployeeClient();
		
		List<Employee> employees = employeeClient.getEmployeeList();
		
		employees.forEach(System.out::println);
	}
	
}
