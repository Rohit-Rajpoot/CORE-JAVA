package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileByBufferedWriter {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("C:/IO/Rays.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		char[] charArry = { 'h', 'i' };

		bw.write(charArry);
		bw.write(',');
		bw.write("ROHIT");

		System.out.println("Successfully....");

		bw.close();
	}

}
