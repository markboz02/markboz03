package com.syntax.class04;

public class NestedIfContinues {
	
	public static void main(String[] args) {
		
		//check if patient has any allergies
		//if no allergies --> you are healthy
		//otherwise check if patient has:
	        //orange allergy --> do not eat oranges
	          //apple allergy --> do not eat apples
	          //kiwi allergy -->do not eat kiwi
	
	
	      boolean allergy=true;
	      boolean appleallergy=true;
	      boolean orangeallergy=true;
	      boolean kiwiallergy=false;
	   
	   if(allergy) {
		   System.out.println("Please answer below");
		   if (orangeallergy) {
			 System.out.println("Do not eat oranges");  
		   }
		   if(appleallergy) {
			  System.out.println("Do not eat apples"); 
		   }
	   }else {
		   System.out.println("You are healthy");
	   }
	}
}
