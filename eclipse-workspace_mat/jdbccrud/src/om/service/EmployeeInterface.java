package om.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeInterface {
	
	public abstract String createEmp(List<Employee> employee);

	public abstract String readEmp(List<Employee> employee,int id,String name);

	public abstract String updateEmp(List<Employee> employee, int id, int temp, String des, float sal);

	public abstract String deleteEmp(List<Employee> employee, int id);
}
