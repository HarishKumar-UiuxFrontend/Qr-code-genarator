package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Employee;

import om.service.EmployeeInterface;
import om.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		EmployeeInterface interfaces = new EmployeeService();
		int id = 0;
		String name = "";
		String designation = "";
		float salary = 0;
		int n;
		do {
			System.out.println("Enter the Operation");
			System.out.println(" 1.Create" + "\n" + " 2.Read" + "\n" + " 3.Update" + "\n" + " 0.Close");
			n = scanner.nextInt();
			switch (n) {
			case 1:
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root",
							"welcome@5902");
					PreparedStatement statement = con
							.prepareStatement("INSERT INTO employee(id,name,designation,salary)values(?,?,?,?)");
					System.out.print("Enter your Id: ");
					id = scanner.nextInt();
					System.out.print("Enter your Name: ");
					scanner.nextLine();
					name = scanner.nextLine();
					System.out.print("Enter your Designation ");
					designation = scanner.next();
					System.out.print("Enter your Salary");
					salary = scanner.nextFloat();
					statement.setInt(1, id);
					statement.setString(2, name);
					statement.setString(3, designation);
					statement.setFloat(4, salary);
					// list.add(new Employee(id, name, designation, salary));
					int rs = statement.executeUpdate();
					if (rs > 0) {
						System.out.println(interfaces.createEmp(list));
					}
					System.out.println();
				} catch (ClassNotFoundException | SQLException e) {

					e.printStackTrace();
				}

				break;

			case 2:
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root",
							"welcome@5902");
					PreparedStatement statement = connection
							.prepareStatement("SELECT * FROM employee WHERE id=? && name=?");
					System.out.println("Enter the Id");
					id = scanner.nextInt();
					System.out.println("Enter the name");
					name = scanner.next();
					statement.setInt(1, id);
					statement.setString(2, name);
					ResultSet rs = statement.executeQuery();
					if (rs.next()) {
						System.out.println(interfaces.readEmp(list, id, name));
					}
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				break;

			case 3:

			}
		} while (n != 0);

	}

}
