package com.syntax.class09;

public class Deneme {
	
	public static void main(String[] args) {
		
		/*
		 * Create an array or animals and store 6
		 * elements into it.Using 2 different loops
		 * print all elements from the array
		 */ 
		 
		
		String[] animals= {"Snake", "Bear", "Dog", "Cat", "Tiger", "Otter"};
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i] + " ");
		}
		for (String animal:animals) {
			System.out.println(animal + " ");
		}
		//Task 2
		int [] nums= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int total=0;
		for (int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		System.out.println(total);


       //find largest element from an array
		int[] numss= {200, 30, -1, 900, 56, 787};

        int max=numss[0];
        
        for(int i=1; i<numss.length; i++) {
        	if(numss[i]>max) {
        		max=numss[i];
        	}
        	System.out.println("The givin array element is:");
        
        }
        
        String[][] months= {{"dec","january","feb"}};
        			
       
	}	   
}   
        
        
        
        
        
        

		
		
             	
		
		
		
		
		
		
		
	


