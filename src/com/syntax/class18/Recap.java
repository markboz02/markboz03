package com.syntax.class18;
//1.
//Create a method that will accept an array as parameters 
//and will return a sum of all elements from that array. 
//Method should be visibly only within same package 
//and accessible by the creating an instance of the class.
//2.
//Create a method that will take a String as a parameter
//and returns reverse String. 
//Method should be available to all classes 
//within your projects and accessible by class name.

//3.
// Create a method that will accept a String as a parameter
// and return a new String that consist only of vowels.
// Method should be available inside the class where it was declared
// and executed by calling it is name.

public class Recap {

	protected int sumFromArray(int[] array) {
		int total = 0;
		for (int i = 0; i< array.length; i++) {
			total +=array[i];
		}
		return total;
	}
	
	public static String getReverse(String str) {
		String reverse="";
		for (int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
	}
	
	private static String getVowels(String str) {
		
		String vowels;
		vowels = str.replaceAll("[^aeiouAEIOU]","");
		return vowels;
		
	}
	
	public static void main(String[] args) {
		Recap obj = new Recap();
		int[] array = { 2, 7, 19, 857};
		System.out.println("total: " + obj.sumFromArray(array));
		
		String str=Recap.getReverse("Hello");
		System.out.println(str);
		System.out.println();getReverse("Good");
		
		String vowels=getVowels("Hello");
		System.out.println(vowels);
		
	}
}
