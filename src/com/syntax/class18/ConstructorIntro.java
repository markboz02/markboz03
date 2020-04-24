package com.syntax.class18;

public class ConstructorIntro {
	
	 ConstructorIntro(){
		System.out.println("I am a constructor");
	}
	
		void hello() {
			System.out.println("Hello Class");
		}
	 
	public static void main(String[] args) {
		
//		ConstructorIntro(){
//		
//		
			
//		}
		
		//to create a constructor: 1. no return type (not even void)
		//                         2. name must be same as class name

		
		
		

			                    // = creating an Object and calling a constructor
			ConstructorIntro obj=new ConstructorIntro();
			
			System.out.println("Code after constructor");
			//calling method
			obj.hello();
		
		

	}

	private static void  ConstructorIntro() {
		// TODO Auto-generated method stub
		
	}                
	
	
	

}
