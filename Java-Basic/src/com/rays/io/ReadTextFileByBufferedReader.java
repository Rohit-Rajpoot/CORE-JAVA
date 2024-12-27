package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFileByBufferedReader {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:/IO/Hello.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		
		while(str != null) {
			
			System.out.println(str);
			
			str = br.readLine();
		}
		
		fr.close();
	}

}