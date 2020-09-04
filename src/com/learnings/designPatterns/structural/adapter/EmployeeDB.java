package com.learnings.designPatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class EmployeeDB {

	private String cn;
	
	private String fName;
	
	private String lName;
	
	private String mail;
	
}
