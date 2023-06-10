package com.main;

public class Interview {
	
	public static boolean isPrime(int num) {
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

//	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			if(isPrime(i)) {
//				System.out.println(i);
//			}
//		}
//
//	}
	public int func(int n) {
		int result;
		if(n == 1) 
		return 1;
		result = func(n-1);
		return result;
	}
	
//	public static void main(String[] args) {
//		Interview inter = new Interview();
//		System.out.println(inter.func(10));
//	}
	
	public static void main(String[] args) {
		String s = "friends";
		int x = 0;
		do {
			System.out.println(s.charAt(x));
			x++;
		}while(x<2);
	}
}
