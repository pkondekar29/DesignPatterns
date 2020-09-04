package com.learnings.designPatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class EmployeePojo implements Employee {

	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
}
