package com.rays.basic;

public class Palindrome {

	public static void main(String[] args) {
		int a = 1221;
		int num = a;
		int remainder;
		int result = 0;
		
		while(num != 0) {
			remainder = num % 10;
			result = result*10 + remainder;
			num = num/10;
			
		}
		if(result == a) {
			System.out.println("a is a palindrome number");
		}
		else {
			System.out.println("a is not a palindrome number");
		}
	}

}
