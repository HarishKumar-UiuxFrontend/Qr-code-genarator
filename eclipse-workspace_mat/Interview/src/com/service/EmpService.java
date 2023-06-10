package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.model.Employee;

public class EmpService implements EmpInterface {

	@Override
	public List<Employee> readEmp(List<Employee> employee) {
		List<Employee> list1 = new ArrayList<>();
		Iterator<Employee> iterator = employee.iterator();
		while (iterator.hasNext()) {
			Employee emp1 = iterator.next();
			list1.add(emp1);
		}
		return list1;
	}

	@Override
	public String updateEmp(List<Employee> employee, int id, int temp, String des, float sal) {
		for (Employee employees : employee) {
			if(employees.getId()==id) {
				if(temp == 1) {
					employees.setDesignation(des);
				}
				else if(temp == 2) {
			  employees.setSalary(sal);
				}
				else {
					return "Invalid";
				}
			}
		}
		return "Updated";
	}

	@Override
	public String deleteEmp(List<Employee> employee, int id) {
		Iterator<Employee> iterator = employee.iterator();
		while(iterator.hasNext()) {
			Employee employees = iterator.next();
			if(employees.getId()==id) {
				iterator.remove();
			}
		}
		return "Deleted Successfully";
	}

	

	
	


}
