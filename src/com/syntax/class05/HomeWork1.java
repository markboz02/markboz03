package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {
   public static void main(String[] args) {
	   
	  // Task-2
	   /*
	    * Write a program to ask user to enter numbers of worked years and annual
	    * salary. If user worked for more or equals to 5 years than user is eligible 
	    * for the bonus, otherwise he is not. Once user is eligible and salery is 
	    * larger than 50000 than bonus = 5000, otherwise bonus=3000.
	    */
       Scanner userInput = new Scanner(System.in);
       System.out.println("How long you are working with the company? ");
       int year = userInput.nextInt();
       System.out.println("What is your Annual Salary? ");
       double salary = userInput.nextDouble();
       
       if (year<= 5) {
    	   System.out.println("You are eligible for bonus!!");
    	   if (salary>=50000) {
    		System.out.println("Your bonus amount is 5000."); 
    	   }else {
    			System.out.println("Sorry, You are not Eligible for Bonus untill you reach 5 year.");
    		}
    	   userInput.close();
    	   }
       }
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
   

