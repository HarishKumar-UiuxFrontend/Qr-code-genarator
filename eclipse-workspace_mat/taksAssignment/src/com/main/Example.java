package com.main;

import java.util.List;
import java.util.Scanner;

import com.service.ExampleService;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the choice");
		ExampleService service = new ExampleService();
		int n = scanner.nextInt();
		switch (n) {
		case 1:
			System.out.println("Enter the input");
			int myrows = scanner.nextInt();
			String ans = service.method(myrows);
			System.out.println(ans);
			break;
			
		case 2:
			System.out.println("Enter the number");
			int num = scanner.nextInt();
			List<Integer> res = service.fibonacciSeries(num);
			System.out.println(res);
			break;
		case 3:
			System.out.println("Enter the number");
			int nums = scanner.nextInt();
			for (int i = 1; i <= nums; i++) {
				if(service.isPrime(i)) {
					System.out.println(i);
				}
			}
			break;
			
		case 4:
			System.out.println("Enter the number");
			int pat = scanner.nextInt();
			System.out.println(service.starPatterns(pat));
			break;
			
		case 5: 
			System.out.println("Enter");
			int number = scanner.nextInt();
			System.out.println(service.reverseNumber(number));
			
		case 6:
			int[] largest = {1,56,23,41,74,14,17};
			int lar = 0;
			int sec = 0;
			for (int i = 0; i < largest.length; i++) {
				for (int j = i+1; j < largest.length; j++) {
					if(largest[i]<largest[j]) {
						sec = largest[i];
						largest[i] = largest[j];
						largest[j] = sec;
					}
				}
				lar = largest[0];
				sec = largest[2];
			}
			System.out.println(lar);
			System.out.println(sec);
		
		case 7:
			int arrvar[] = new int[10];
			for (int i = 0; i < 10; ++i) {
				arrvar[i] = i;
				System.out.print(arrvar[i]+" ");
				i++;
			}
			break;
			
		case 8:
			int nu[] = new int[] {0,1,2,3,4,5,6,7,8,9};
			int p = 8;
			p = nu[nu[p]/2];
			System.out.println(p);
			break;
			
		case 9:
			int ab =1;
			int numbers = 5;
			for (int j = 3; j <=numbers; j++) {
				ab = ab*j;
			}
			System.out.println(ab);
			
		case 10:
			int a = 3;
			int b = 3;
			long temp =1;
			while(b!=0) {
				temp *=b;
				--b;
			}
			System.out.println(temp);
		}

		scanner.close();
	}

}
