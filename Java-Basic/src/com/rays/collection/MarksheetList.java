package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MarksheetList {
	
	public static void main(String[] args) {
		
		ArrayList marksheet = new ArrayList();
		
		marksheet.add(new Marksheet("01", "Aman", 86));
		
		marksheet.add(new Marksheet("02", "Bharat", 80));
		
		marksheet.add(new Marksheet("03", "Carlos", 89));
		
		marksheet.add(new Marksheet("04", "Divya", 83));
		
		marksheet.add(new Marksheet("05", "Falak", 85));
		
		System.out.println(marksheet);
		
		Iterator it = marksheet.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
