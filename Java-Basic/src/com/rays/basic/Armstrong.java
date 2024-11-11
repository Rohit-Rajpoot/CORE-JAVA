package com.rays.basic;

public class Armstrong {

	public static void main(String[] args) {
		int a = 153;
		int num = a;
		int remainder;
		int power;
		int result = 0;
		
		while(num != 0) {
			remainder = num % 10;
			power = remainder*remainder*remainder;
			result = result + power;
			num = num/10;
			
		}
		if(result == a) {
			System.out.println("a is a armstrong number");
		}
		else {
			System.out.println("a is not a armstrong number");
		}
		
	}

}
