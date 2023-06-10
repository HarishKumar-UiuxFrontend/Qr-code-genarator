package com.service;

import java.util.ArrayList;
import java.util.List;

public class ExampleService {

	public String method(int myrows) {
		String temp = "";
		for (int i = 0; i < myrows; i++) {
			for (int j = i; j < myrows; j++) {
				temp += " ";
			}
			for (int j = 0; j <= i; j++) {
				temp += "* ";
			}
			temp += "\n";
		}
		return temp;
	}

	public boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for (int i = 2; i <= num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public List<Integer> fibonacciSeries(int num) {
		List<Integer> lists = new ArrayList<>();
		int first = 0;
		int second = 1;
		lists.add(first);
		lists.add(second);
		for (int i = 0; i < num; i++) {
			int tot = first + second;
			first = second;
			second = tot;
			lists.add(tot);
		}
		return lists;
	}

	public String starPatterns(int num) {
		String temp = "";
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				temp += "1";
			}
			for (int j = 0; j <= i; j++) {
				temp += "";
			}
			temp += "\n";
		}
		return temp;
	}

	public int reverseNumber(int number) {
		int rev = 0;
		int rem = 0;
		while (number != 0) {
			rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;

		}
		return rev;
	}
}
