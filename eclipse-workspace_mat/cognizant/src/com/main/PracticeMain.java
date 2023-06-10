package com.main;

import java.util.Arrays;
import java.util.Scanner;

import com.service.PracticeService;

public class PracticeMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		PracticeService service = new PracticeService();
		System.out.println("Enter the Operation");
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			// sum of numbers
			int sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the input");
			int tot = sc.nextInt();
			while (tot > 0) {
				int r = tot % 10;
				tot = tot / 10;
				sum = sum + r;
			}
			System.out.println("Total is: " + sum);
			break;

		case 2:
			//Base and Exponents
			int result = 1;
			System.out.println("the Exoponent is: ");
			int in = scanner.nextInt();
			System.out.println("the base is: ");
			int base = scanner.nextInt();
			while (in != 0) {
				result *= base;
				--in;
			}
			System.out.println("Power of Number is: " + result);
			break;

		case 3:
			//Addition without using addition operator
			System.out.println("num1");
			int num1 = scanner.nextInt();
			System.out.println("num2");
			int num2 = scanner.nextInt();
			System.out.println(service.addNumbers(num1, num2));
			break;

		case 4:
			// Sum of digits in single digits
			System.out.println("Enter");
			int a = scanner.nextInt();
			int b = 0, c;

			while (a > 10) {
				b = 0;
				while (a > 0) {
					c = a % 10;
					a = a / 10;
					b += c;
				}
				System.out.println(b);
				if (b > 10)
					a = b;
			}
			System.out.println("\nSum of the digits in single digit is:" + b);
			break;
			
		case 5:
			System.out.print("Enter the String: ");
			String inp = scanner.next();
			System.out.println("enter the removing character: ");
			char re = scanner.next().charAt(0);
			String ans = PracticeService.removeChar(inp, re);
			System.out.println(ans);
			break;
			
		case 6:
			System.out.println("Enter");
			int stringCount = scanner.nextInt();
			String[] storingStrings = new String[stringCount];
			for (int i = 0; i < storingStrings.length; i++) {
				System.out.println("Enter the Strings");
				storingStrings[i] = scanner.next();
			}
			String[] res = service.removeDuplicate(storingStrings);
			for (int i = 0; i < res.length; i++) {
				if(res[i] != null) {
					System.out.println(res[i]);
				}
			}
			break;
			
		case 7:
			System.out.println("Enter the word");
			String name = scanner.next();
			char[] arr = name.toCharArray();
			System.out.println(PracticeService.repeated(arr));
			break;
			
		case 8:
			String s = "Protechsoft";
			PracticeService.nonRepeated(s);
			break;
			
		case 9:
			int[] nums = {23,11,4,119,456,236,1,789,2};
			int[] arr1 = new int[nums.length];
			String[] strings = new String[nums.length];
			for (int i = 0; i < nums.length; i++) {
				strings[i] = Integer.toString(nums[i]);
			}
			Arrays.sort(strings);
			for (int i = 0; i < strings.length; i++) {
				arr1[i] = Integer.parseInt(strings[i]);
				System.out.println(arr1[i]);
			}
			break;
			
		case 10:
			System.out.println("Enter");
			char[] elements = scanner.next().toCharArray();
			String store = "";
			for (int i = 0; i < elements.length; i++) {
				for (int j = i+1; j < elements.length-1; j++) {
					if(elements[i] == elements[j]) {
						store += elements[j];
					}
				}
			}
			System.out.println(store);
			break;
			
		case 11:
			System.out.println("Enter the input");
			
			break;
		        
		case 12: 
			String word = "Tit4Tat";
			String sto = "";
			char[] ch = word.toCharArray();
			for (int i = ch.length-1; i >=0; i--) {
				if(ch[i]>=65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122) {
					sto += ch[i];
					System.out.println(sto);
				}
			}
			break;
		}
	}
}
