package com.main;

import java.util.Scanner;

public class Softsuave {

	public static String lcp(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the operation");
		System.out.println("1. Multiplication of Two complex Numbers \n" + "2. Longest Repeating Sequence");
		int n = scanner.nextInt();
		switch (n) {

		case 1:
			System.out.println("ENTER THE TWO NUMBERS");
			String input1 = scanner.next();
			String input2 = scanner.next();

			String[] x = input1.split("\\+|i|-");
			String[] y = input2.split("\\+|i|-");

			int real1 = Integer.parseInt(x[0]);
			int real2 = Integer.parseInt(y[0]);
			int img1 = Integer.parseInt(x[1]);
			int img2 = Integer.parseInt(y[1]);

			int out1 = (real1 * real2) - (img1 * img2);
			int out2 = (img1 * real2) + (img2 * real1);
			String get = out1 + "+" + out2 + "i";
			System.out.println(get);
			break;

		case 2:
			System.out.println("Enter the input");
			String word = scanner.next();
			String temp = "";
			int len = word.length();
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j < len; j++) {
					String q = lcp(word.substring(i, len), word.substring(j, len));
					if (q.length() > temp.length()) {
						temp = q;
					}
				}
			}
			System.out.println(temp);
			break;

		case 3:
			System.out.println("Enter the iput");
			String num1 = scanner.next();
			String num2 = scanner.next();
			int total = 0, cur = 0, pre = 0, val;
			for (int i = 0; i < num2.length(); i++) {
				while (cur < num1.length()) {
					if (num2.charAt(i) == num1.charAt(cur)) {
						val = pre - cur;
						if (val < 0) {
							val = -val;
						}
						pre = cur;
						total += val;
						cur = 0;
						break;
					} else {
						cur++;
					}
				}
			}
			System.out.println(total);
		}

	}
}
