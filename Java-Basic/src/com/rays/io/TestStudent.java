package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudent {
	
	public static void main(String[] args) throws Exception {
		
		Student s = new Student(1, "Rays");

		// Serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/IO/student.txt"));

		out.writeObject(s);

		out.close();

		// Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/IO/student.txt"));

//		s = (Student) 
		in.readObject();

		System.out.println(s);

		in.close();
	}
	
}
