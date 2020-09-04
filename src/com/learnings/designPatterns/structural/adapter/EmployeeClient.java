package com.learnings.designPatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		
		List<Employee> employees = new ArrayList<>();
		
		Employee employeePojo = new EmployeePojo("1", "Palash", "Kondekar", "palash.kondekar@gmail.com");
		employees.add(employeePojo);
		
		// We created an adapter for Employee DB to return something which this client understands
		Employee employeeDB = new EmployeeDBAdapter(new EmployeeDB("2", "asd", "asd", "asd@gmail.com"));
		employees.add(employeeDB);
		
		return employees;
		
	}
	
}
