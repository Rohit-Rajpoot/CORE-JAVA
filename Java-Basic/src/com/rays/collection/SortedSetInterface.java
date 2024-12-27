package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
	
	public static void main(String[] args) {
		
//		It works as priority based
		SortedSet s = new TreeSet();
		
		s.add(33);
		s.add(77);
		s.add(44);
		s.add(99);
		s.add(55);
		s.add(22);
		s.add(88);
		
		for (Object sort : s) {
			
			System.out.println(sort);
			
		}
		
		System.out.println("retrun fist element of sorted set = " + s.first());
		System.out.println("return last element of sorted set = " + s.last());

		// Returns elements less than the specified value
		SortedSet headSet = s.headSet(30);
		System.out.println("headSet(30): " + headSet);

		// Returns elements greater than or equal to the specified value
		SortedSet tailSet = s.tailSet(30);
		System.out.println("tailSet(30): " + tailSet);

		SortedSet subSet = s.subSet(20, 50);
		System.out.println("subSet(20, 50): " + subSet);
		
	}

}
