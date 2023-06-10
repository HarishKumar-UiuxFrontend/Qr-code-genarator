package com.main;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the operation");
		int n = scanner.nextInt();
		
		switch (n) {
		case 1:
			String x = "xyz";
			x.toUpperCase();
			String y = x.replace('Y', 'y');
			y = y+"abc";
			System.out.println(y);
			break;
			
		case 2:
			int i = 1;
			int j = 10;
			do {
				if(i++ > --j ) {
					continue;
				}
			}while(i<5);
			System.out.println(i+" "+j);
			
		case 3:
			
		}

	}

}
