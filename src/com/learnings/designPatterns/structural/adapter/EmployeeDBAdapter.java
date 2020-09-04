package com.learnings.designPatterns.structural.adapter;

import lombok.ToString;

@ToString
public class EmployeeDBAdapter implements Employee {

	private EmployeeDB instance;
	
	public EmployeeDBAdapter(EmployeeDB employeeDB) {
		this.instance = employeeDB;
	}

	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getFName();
	}

	@Override
	public String getLastName() {
		return instance.getLName();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

}
