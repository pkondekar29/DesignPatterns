package com.learnings.designPatterns.behavorial.momento;

// Originator
public class Employee {
	private String name;
	private String address;
	private int age;
	
	public EmployeeMomento save() {
		return new EmployeeMomento(this.name);
	}
	
	public void revert(EmployeeMomento employeeMomento) {
		this.name = employeeMomento.getName();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Address: " + this.address;
	}
}
