package com.syntax.class26;

import java.util.ArrayList;

/*Create a generic ArrayList that will store 5 names into it.
	 * Find out whether the given ArrayList is empty or not?
	 * Check whether the specific name is present in an ArrayList or not?
	 * Find the size of your arrayList and print all values from that*/
	public class Task {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Ali");
		names.add("Ahmet");
		names.add("Hasan");
		names.add("James");
		names.add("Hatice");
		
		boolean isempty= names.isEmpty();
		System.out.println("Is arrayList empty? "+isempty );
		
		boolean iscontain=names.contains("Hasan");
		System.out.println("Does arrayList contain Hasan? "+ iscontain);
		
		boolean iscontains=names.contains("Hatice");
		System.out.println("Does arrayList contain Hatice? "+ iscontains);
		
		int arrSize=names.size();
		System.out.println("How many elements does arrayList have? "+ arrSize + " elements");
		
		System.out.println("What are the elements of arrayList ?");
		for (String nameList:names) {
			System.out.println(nameList);
		}
		

	}

}
