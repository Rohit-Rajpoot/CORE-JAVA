package com.rays.collection;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
        for(char c = 'a'; c <= 'z'; c++) {
			
			s.push(c);
		}
        
        System.out.println("Stack = " + s);
        
        Stack s1 = new Stack();
        
        while (!s.isEmpty()) {
        	
			System.out.println(" Stack = " + s1.push(s.pop()));
			
			}
        
        System.out.println(s1);
	}

}
