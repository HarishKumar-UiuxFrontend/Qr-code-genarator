package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Employee;
import com.service.EmpInterface;
import com.service.EmpService;

public class EmpMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		EmpInterface interfaces = new EmpService();
		int id = 0;
		String name = "";
		String designation = "";
		float salary = 0;
		int n;
		do {
			System.out.println("Enter the operation");
			System.out.println(
					" 1.Create" + "\n" + " 2.Read" + "\n" + " 3.Update" + "\n" + " 4.Delete" + "\n" + " 0.Close");
			n = scanner.nextInt();
			switch (n) {
			case 1:
				System.out.print("Enter your Id: ");
				id = scanner.nextInt();
				System.out.print("Enter your Name: ");
				scanner.nextLine();
				name = scanner.nextLine();
				System.out.print("Enter your Designation ");
				designation = scanner.next();
				System.out.print("Enter your Salary");
				salary = scanner.nextFloat();
				list.add(new Employee(id, name, designation, salary));
				System.out.println();
				System.out.println("Details Created");
				System.out.println();

				break;

			case 2:
				List<Employee> employees = interfaces.readEmp(list);
				for (Employee employee : employees) {
					System.out.println(employee);
				}
				System.out.println();
				break;

			case 3:
				System.out.print("Enter the id");
				id = scanner.nextInt();
				System.out.println("What should update\n1.Designation \n2.Salary");
				int temp = scanner.nextInt();
				if (temp == 1) {
					System.out.println("Enter Updated Designation");
					designation = scanner.next();
				} else if (temp == 2) {
					System.out.println("Enter Updated Salary");
					salary = scanner.nextFloat();
				}
				String res = interfaces.updateEmp(list, id, temp, designation, salary);
				System.out.println(res);
				break;

			case 4:
				System.out.println("Enter the id");
				id = scanner.nextInt();
				System.out.println(interfaces.deleteEmp(list, id));
				break;
			}
		} while (n != 0);
		System.out.println("Thank You");

	}

}
