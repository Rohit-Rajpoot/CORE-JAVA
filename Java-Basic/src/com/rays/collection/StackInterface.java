package com.rays.collection;

import java.util.Stack;

public class StackInterface {
	
	public static void main(String[] args) {
		
//		Stack is a class
		Stack s = new Stack();
		
//		To add element in stack we use push() method
		for(char c = 'a'; c <= 'z'; c++) {
			
			s.push(c);
		}
		
		System.out.println("Stack = " + s);
		
		System.out.println("Stack = " + s.pop());
		
		System.out.println("Stack = " + s.pop());
		
		System.out.println("Stack = " + s.pop());
		
		System.out.println("Stack = " + s);
		
		System.out.println("Stack = " + s.peek());
		
		System.out.println("Stack = " + s);
	}

}
