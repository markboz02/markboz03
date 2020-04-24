package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		 /*
		  * Create an array of words: Java,Saturday,day,coding,is.
		  * print the following sentence using elements of array:
		  * "Saturday is java coding Day".
		  */
		  String[] words ={"Java","Saturday","Day.","coding", "is"};
		    System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);

		
		
		System.out.println("=====================================================");
		/*
		 * Create an array of names and store all names of your group.
		 * Then print your name from that array.(use 2 different ways of
		 * creating an array)
		 */ 
		 
		//1st way
		String[] groupNames ={"Mark Boz","Ali","Nilson","halim", "Yuri","Fatma"};
		System.out.println(groupNames[0]);
		
		
		//2nd way
		
		        String[] groupNames1 =new String[6];
		                groupNames[0]="Mark Boz";
		                groupNames[1]="Ali";
		                groupNames[2]="Nilson";
		                groupNames[3]="halim";
		                groupNames[4]="Yuri";
		                groupNames[5]="Fatma";
		        System.out.println(groupNames[0]);
		           
		    	System.out.println("**************************************************");
				/*
				 * Create an array of chars and store grades into it:
				 * A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
				 */
				char[] grades= {'A','B','C','D','E','F'};
				//getting all elements
				
				for(int i=0; i<grades.length; i++) {
					System.out.print(grades[i]+" ");               
				}
				System.out.println();
				
				System.out.println(" -- printing using advanced for loop --- ");
		        
				for(char grade:grades) {
					System.out.print(grade+" ");
				}
				System.out.println();
				//create an array of fruits and retrieve all elements
				
                String[] fruits= {"Banana", "Kiwi", "Orange","Pear","Apple", "Mango"};
                // if fruit is apple --> that is your favorite fruit
                //advanced for loop, enhanced for loop, for each loop
                for(String fruit:fruits) {           //instead of fruit you can use any veriable a,b,k my own.comment
                	
                	if (fruit.equals("Apple")) {
                		System.out.println(fruit + " is your favorite fruite");
                	}else {
                		System.out.println(fruit);
                	}
                }

                System.out.println("-----------------------------");
                
                for(int i=0; i<fruits.length; i++) {
                	System.out.println(fruits[i]);
                }
		
		


		
		
		
		
		
		
		
		
	
		
		
		
	}

}
