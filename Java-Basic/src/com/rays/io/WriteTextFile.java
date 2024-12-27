package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("C:/IO/Hello.txt",true);
		
		char[] cArray = {'H','i'};
		
//		fw.write(cArray);
		
//		fw.write(',');
		
		fw.write(" INTELLIGENCE");
		
		fw.close();
		
		System.out.println("Data Added Sucessfully");
		
		
		
		
		
	}

}
