package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {
	
	public static void main(String[] args) throws Exception {
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("C:/IO/Primitive.txt"));

		out.writeInt(1);
		out.writeBoolean(true);
		out.writeDouble(45.25);
		out.writeChar('A');

		out.close();

		System.out.println("Data Added......");

		DataInputStream in = new DataInputStream(new FileInputStream("C:/IO/Primitive.txt"));

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());

		in.close();
	}

}
