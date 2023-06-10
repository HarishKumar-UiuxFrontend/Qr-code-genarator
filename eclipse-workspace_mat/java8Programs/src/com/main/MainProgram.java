package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.service.ServiceProgram;

public class MainProgram {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(11, "Eleven", 58);
		Employee employee2 = new Employee(12, "Twelve", 62);
		Employee employee3 = new Employee(13, "Thirteen", 64);
		Employee employee4 = new Employee(14, "fourteen", 52);
		Employee employee5 = new Employee(15, "Fifteen", 54);
		
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		
		ServiceProgram program = new ServiceProgram();
		List<Employee> ans =  program.checkByAge(list, 60);
		System.out.println(ans);
		
	}

}
