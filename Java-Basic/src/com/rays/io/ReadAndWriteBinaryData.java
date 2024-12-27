package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteBinaryData {
	
	public static void main(String[] args) throws Exception {
		
		String source = "C://Users//dell//Downloads//Fox.jpg";
		String target = "C://Users//dell//Downloads//Fox1.jpg";

		FileInputStream fr = new FileInputStream(source);
		FileOutputStream fw = new FileOutputStream(target);

		BufferedInputStream br = new BufferedInputStream(fr);
		BufferedOutputStream bw = new BufferedOutputStream(fw);

		int i = br.read();

		while (i != -1) {

			System.out.println(i);

			bw.write(i);

			i = fr.read();

		}

		System.out.println("Copied Successfully...");
		fr.close();
		fw.close();

	}

}
