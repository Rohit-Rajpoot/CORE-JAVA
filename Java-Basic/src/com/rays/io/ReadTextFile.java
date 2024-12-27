package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFile {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:/IO/Hello.txt");
		
		int i = fr.read(); // fr.read() method gives integer value so we hold it in a integer variable
		
		char c;
		
		while(i != -1) {
			
			c = (char)i;
			
			System.out.print(c);
			
	        i = fr.read(); // It read if the i has next value
		}
		
		fr.close();
	}

}
