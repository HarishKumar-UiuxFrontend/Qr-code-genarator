package com.service;

import java.util.HashSet;
import java.util.Set;

public class PracticeService {

	public int addNumbers(int x, int y) {
		while (y != 0) {
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}

	public static String removeChar(String str, char c) {
		int n = str.length();
		String temp = "";
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != c) {
				temp += str.charAt(i);
			}
		}
		return temp;
	}

	public String[] removeDuplicate(String[] storingStrings) {
		String[] returnString = new String[storingStrings.length];
		int k = 0;
		Set<String> set = new HashSet<>();
		for (String string : storingStrings) {
			if (set.add(string) == true) {
				returnString[k] = string;
				k++;
			}
		}
		return returnString;
	}

	public static char repeated(char[] str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length; i++) {
			char c = str[i];
			if (set.contains(c)) {
				return c;
			} else
				set.add(c);
		}
		return 0;
	}

	public static void nonRepeated(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
