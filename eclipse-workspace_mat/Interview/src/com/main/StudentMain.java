package com.main;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.exception.StudentException;
import com.model.Student;
import com.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentService service = new StudentService();
		Map<Integer, Student> maps = new HashMap<>();
		String name = "";
		int num = 0;
		outer: for (;;) {
			System.out.println("Enter the Operation");

			System.out.println(" 1.Create" + "\n" + " 2.Read" + "\n" + " 3.Update" + "\n" +" 4.Delete"+" 0.Close");
			int n = scanner.nextInt();

			switch (n) {
			case 1:
				System.out.println("Enter Name");
				try {
					name = scanner.next();
				} catch (InputMismatchException i) {
					System.err.println("Enter the correct data");
				}
				System.out.println("ID");
				try {
					num = scanner.nextInt();
				} catch (InputMismatchException i) {
					System.err.println("Enter the correct data");
				}
				System.out.println("Password");
				String pass = scanner.next();
				System.out.println("gender");
				char g = scanner.next().charAt(0);
				System.out.println("Mark");
				float m = scanner.nextFloat();
				Student student = new Student(num, name, pass, g, m);
				maps.put(num, student);
				System.out.println(service.studentDetails(student, num));
				System.out.println("Student Details Created");
				System.out.println();
				break;

			case 2:
				for (Map.Entry<Integer, Student> entry : maps.entrySet()) {
//					Integer key = entry.getKey();
//					Student val = entry.getValue();
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
				break;

			case 3:
				for (Map.Entry<Integer, Student> entry : maps.entrySet()) {
					Integer key = entry.getKey();
					Student val = entry.getValue();
					System.out.println(key);
				}
				System.out.println("Enter the Id");
				int nums = scanner.nextInt();
				for (Map.Entry<Integer, Student> entry : maps.entrySet()) {
					Integer key = entry.getKey();
					Student val = entry.getValue();
					if (key == nums) {
						System.out.println(val.getStuName());
						System.out.println("Enter the password");
						String passwo = scanner.next();
						try {
							boolean map = service.checkDetails(maps, passwo);
							if (map == true) {
								System.out.println("Enter the new Password");
//								String passW = scanner.next();
								//System.out.println(password);
								System.out.println(service.updateDetails(maps, passwo, name));
							}
						} catch (StudentException e) {
							System.err.println(e.getErrorMessage());

						}

					}

				}

				break;

			case 0:
				break outer;

			}

		}
		scanner.close();
	}
}
