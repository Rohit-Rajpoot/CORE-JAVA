package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
//		Add new elements in ArrayList
		c.add(18);
		c.add(35);
		c.add("aa");
		c.add(true);
		c.add("xx");
		c.add(88);
		
		System.out.println(c);
		
//		Add same sequence of existing elements
		
		c.addAll(c);
		System.out.println(c);
		
	
//		Clear all elements from Array
		
		c.clear();
		System.out.println(c);
		
//		Remove elements from Array
		
		c.remove("aa");
		System.out.println(c);
		
//		Remove all elements from Array
		
		c.removeAll(c);
		System.out.println(c);
	}

}
