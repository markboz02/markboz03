package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
	/* We have total 7 days in a week
	 * if day is 2,3 -->SDLC Class
	 * if day 6, 7 --> Java Class
	 * if day 1, 5 -->Off Day
	 * if day 4 --> review class
	 */ 
	 
		int day=6;
				
	  if(day==2 && day==3) {
		  System.out.println("Today is SDLC Class");
	  }else if(day==6 && day==7) {
		  System.out.println("Today is Java Class");
	  }else if(day==1 && day==5) {
		  System.out.println("Today is no Class, it is day off");
	  }else if(day==4) {
		  System.out.println("Today is review class with Elion");
	  }else {
		  System.out.println("Invald day");
	  }	
	 

	}

}
