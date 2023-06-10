package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class ServiceProgram {
	
	public List<Employee> checkByAge(List<Employee> employee, int age) {
		List<Employee> list = new ArrayList<>();
		for (Employee emp : employee) {
			if(emp.getAge() > age) {
				list.add(emp);
			}
		}
		return list;
	}
}
