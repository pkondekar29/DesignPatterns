package com.learnings.designPatterns.behavorial.momento;

import java.util.Stack;

/**
 * 
 * The caretaker has a stack of employee history
 *
 */
public class CareTaker {

	Stack<EmployeeMomento> employeeHistory = new Stack<>();
	
	public void save(Employee employee) {	// whenever we ask the caretaker save an employee, the caretaker will stack an employeeMomento in its history 
		employeeHistory.push(employee.save());
	}
	
	public void revert(Employee employee) {
		employee.revert(employeeHistory.pop());
	}
}
