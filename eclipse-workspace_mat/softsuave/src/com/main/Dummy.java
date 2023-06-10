package com.main;

import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Operation");
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			System.out.println("Enter the number");
			int num1 = scanner.nextInt();
			for (int i = 1; i <= num1; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;

		case 2:
			System.out.println("Enter the number");
			int alphabet = 65;
			int num2 = scanner.nextInt();
			for (int i = 1; i <= num2; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print((char) (alphabet + j - 1) + " ");
				}
				System.out.println();
			}
			break;

		case 3:
			System.out.println("Enter the numbers");
			int num3 = scanner.nextInt();
			for (int i = 1; i <= num3; i++) {
				for (int j = num3; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;

		case 4:
			System.out.println("Enter the numbers");
			int num4 = scanner.nextInt();
			for (int i = 1; i <= num4; i++) {
				for (int j = num4; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;

		case 5:
			System.out.println("Enter the numbers");
			int num5 = scanner.nextInt();
			for (int i = num5; i >= 1; i--) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = i; j <= num5; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;

		case 6:
			System.out.println("Enter the numbers");
			int alpha = 65;
			int num6 = scanner.nextInt();
			for (int i = 1; i <= num6; i++) {
				for (int j = num6; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print((char) (alpha + j - 1) + " ");
				}
				System.out.println();
			}
			break;

		case 7:
			System.out.println("Enter the numbers");
			int alp = 65;
			int num7 = scanner.nextInt();
			for (int i = num7; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = i; j <= num7; j++) {
					System.out.print((char) (alp + j - 1) + " ");
				}
				System.out.println();
			}
			break;

		case 8:
			System.out.println("Enter the size");
			int size = scanner.nextInt();
			System.out.println("Enter the arrays");
			int[] arr = new int[size];
			String[] strings = new String[arr.length];
			for (int i = 0; i < size; i++) {
				arr[i] = scanner.nextInt();
			}
			break;
		}
		scanner.close();
	}
}