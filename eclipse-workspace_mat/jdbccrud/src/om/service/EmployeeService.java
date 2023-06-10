package om.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeService implements EmployeeInterface {

	@Override
	public String createEmp(List<Employee> employee) {
		List<Employee> list = new ArrayList<>();
		for (Employee employees : employee) {
			list.add(employees);
		}
		return "Created";
	}

	@Override
	public String readEmp(List<Employee> employee, int id, String name) {
		for (Employee employees : employee) {
			if (employees.getId() == id && employees.getName() == name) {
				return "Employee Found";
			}
		}
		return "Not Found";
	}

	@Override
	public String updateEmp(List<Employee> employee, int id, int temp, String des, float sal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmp(List<Employee> employee, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
