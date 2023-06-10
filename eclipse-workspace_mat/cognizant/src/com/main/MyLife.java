package com.main;

import java.util.Scanner;

public class MyLife {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("LIFE LESSONS");
		String word = scanner.next();
		if (word.equalsIgnoreCase("TIP")) {
			System.out.println();
			System.out.println("Enter your favour");
			System.out.println(
					"1. Want to Successful after failure \n2. How to become Successful \n3. If I doesn't SUCCESS");
		}
		System.out.println();
		int m = scanner.nextInt();
		if (m == 1) {
			System.out.println("If you Never Know Failure \nYou Will Never know SUCCESS");
		}
		System.out.println();
		int n = scanner.nextInt();
		if (n == 2) {
			System.out.println("Follow the Rule No.1");
		}
		System.out.println();
		int k = scanner.nextInt();
		if (k == 3) {
			System.out.println("Follow until become SUCCESSFUL");
		}
	}

}
