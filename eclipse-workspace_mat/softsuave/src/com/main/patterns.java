package com.main;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the required pattern");
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			// Right angle numb increasing pattern
			System.out.println("Enter the number");
			int num1 = scanner.nextInt();
			for (int i = 1; i <= num1; i++) {
				for (int j = i; j <= num1; j++) {
					System.out.print("");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
			break;

		case 2:
			// Star Diamond pattern
			System.out.println("Enter the number");
			int num2 = scanner.nextInt();
			for (int i = 1; i <= num2; i++) {
				for (int j = i; j < num2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for (int i = num2 - 1; i >= 0; i--) {
				for (int j = num2; j >= i; j--) {
					System.out.print(" ");
				}
				for (int j = i - 1; j >= 0; j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
			break;

		case 3:
			// Diamond pattern using numbers
			System.out.println("Enter the number");
			int num3 = scanner.nextInt();
			for (int i = 1; i <= num3; i++) {
				for (int j = i; j <= num3; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			for (int i = num3 - 1; i >= 0; i--) {
				for (int j = num3; j >= i; j--) {
					System.out.print(" ");
				}
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(i + " ");
				}
				
				System.out.println();
			}
			break;

		case 4:
			System.out.println("Enter the number");
			int num4 = scanner.nextInt();
			int tem = num4;
			for (int i = num4; i > 0; i--) {
				for (int j = num4; j >= i; j--) {
					System.out.print("");
				}
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(tem + " ");
				}
				tem--;
				System.out.println();
			}
			for (int i = 2; i <= num4; i++) {
				for (int j = i; j < num4; j++) {
					System.out.print("");
				}
				for (int j = 0; j < i; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;
			
		case 5:
			System.out.println("Enter the number");
			int add = scanner.nextInt();
			int sum = 0;
			for (int i = 1; i <= add; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
			break;

		case 6:
			int[] arr = { 1, 2, 5, 4, 7, 8, 11, 20 };
			int[] a = new int[arr.length];
			int index = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					a[index] = arr[i];
					index++;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 != 0) {
					a[index] = arr[i];
					index++;
				}
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			break;

		case 7:
			String mail = "matheshvicky05@gmail.com";
			char[] ch = mail.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122 || ch[i] >= 48 && ch[i] <= 57) {
					System.out.print(ch[i]);
				}
			}
			break;

		case 8:
			System.out.println("Enter the numbers");
			int num5 = scanner.nextInt();
			for (int i = 1; i <= num5; i++) {
//				for (int j = 1; j < i; j++) {
//					System.out.print("");
//				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;
			
		case 9:
			System.out.println("Enter the number");
			int alphabet = 65;
			int num6 = scanner.nextInt();
			for (int i = 1; i <= num6; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print((char)(alphabet+j-1)+" ");
				}
				System.out.println();
			}
			break;
			
		case 10:
			System.out.println("Enter the input");
			int m = scanner.nextInt();
			for (int i = 1; i <= m; i++) {
				for (int j = i; j <= m; j++) {
					System.out.print(" ");
				}
				for (int j = i; j>=1; j--) {
					System.out.print(j);
				}
				for (int j = 1+1; j <=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			break;
			
		case 11:
			System.out.println("Enter the pattern");
			int pat = scanner.nextInt();                         //  5 5 5 5 5 
																 //   4 4 4 4
			for (int i = pat; i>=1; i--) {                       //    3 3 3
				for (int j = pat; j>=i; j--) {                   //     2 2
					System.out.print(" ");                       //      1
				}
				for (int j =i ; j >= 1; j--) {
					System.out.print(i+" ");
				}
				System.out.println();
				
			}
			break;
			
		case 12:
			System.out.println("Enter the pattern");
			int pat1 = scanner.nextInt();
			for (int i = pat1; i >= 1; i--) {
				for (int j = i; j >= 1; j--) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}