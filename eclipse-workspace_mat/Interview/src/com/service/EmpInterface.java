package com.service;

import java.util.List;

import com.model.Employee;

public interface EmpInterface {

	public abstract List<Employee> readEmp(List<Employee> employee);

	public abstract String updateEmp(List<Employee> employee, int id, int temp, String des, float sal);

	public abstract String deleteEmp(List<Employee> employee, int id);

}
