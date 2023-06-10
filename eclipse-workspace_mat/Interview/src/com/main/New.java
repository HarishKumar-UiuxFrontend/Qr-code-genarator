package com.main;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter");
		String name = scanner.next();
		char[] ch = name.toCharArray();
		String temp ="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]<=65 && ch[i]>=90 || ch[i]<=97 && ch[i]>=122) {
				temp += ch[i];
				System.out.println(temp);
			}
			else {
				System.out.println("No");
			}
		}
		
		
	}

}
