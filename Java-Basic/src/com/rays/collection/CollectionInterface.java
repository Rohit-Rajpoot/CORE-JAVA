package com.rays.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterface {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();

		c.add(2);
		c.add(5.2);
		c.add("KGF");
		c.add('a');
		c.add(true);

		System.out.println(c);
		System.out.println("------forEach-Loop-------");
		
		for (Object o : c) {
			
			System.out.println(o);

		}
		
		System.out.println("----------Fetch Elements Using Iterator----------");
		
		Iterator it = c.iterator();
		
		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
