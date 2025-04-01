package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String id;
	private double salary;
	private boolean paid;

	public Employee(String number, int i) {
		setId(number);
		setSalary(i);
	}
}
