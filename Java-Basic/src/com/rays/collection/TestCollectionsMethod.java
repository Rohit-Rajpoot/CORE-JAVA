package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollectionsMethod {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(3);

		System.out.println("list = " + list);

		Collections.sort(list);

		System.out.println("list in sorted order = " + list);

//		Collections.shuffle(list);
//
//		System.out.println("list in random order = " + list);
//		
//		Collections.reverse(list);
//		
//		System.out.println("list in reverse order = " + list);
//		
		ArrayList toList = new ArrayList();
		
		Collections.copy(list, toList);
		
		System.out.println("Copied List = " + list);
		
		
		

	}

}
