package com.syntax.class02;

public class Trying {
	
	public static void main(String[] args ) {
		
	
	
	String Name ="Ahmet";
	String LastName ="Haci";
	char grade ='B';
	String City = "Atlanta";
	String State = "Georgia";
	long phoneNumber = 5206669095L; 		
	
	
	//String city = "Chantilly";-->error saying duplicate variable
	City = "Chantilly";
	State=" Virginia";
	
	phoneNumber=5206669095l;
	
	System.out.println(City);
	System.out.println("My name is "+Name+" and "+"my lastname is "+LastName+".");
	System.out.println("I live in city of "+City+" State" +State+" and "+"phoneNumber"+phoneNumber+"!");
	
	
}

}
