package com.syntax.class11;

public class Deneme {
	public static void main(String[] args) {
		
		String name = "Billy Bob Joe";
		
		System.out.println("Name:"+name);
		System.out.println("UpperCase: "+name.toUpperCase());
		System.out.println("Lowercase: "+name.toLowerCase());
		System.out.println("First char: "+name.charAt(0));
		System.out.println("Length: "+name.length());
		System.out.println("Last char: " +name.charAt(12));
		System.out.println("Substring: "+ name.substring(10,13));
		
		
		String str="Good Morning Students!";
			
		char letter;
		for(int i=0; i<str.length(); i++) {
			
			letter=str.charAt(i);
			System.out.print(letter+" ");
		}

	   
			  
			
			  
			
	    
	}

}
