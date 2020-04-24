package com.syntax.class02;

public class ModulusOperator {
	
	public static void main(String [] args) {
		
	float f=12.50f;
	float f1=2.7f;
	
	//float can hold up to 5-7 decimals
	double d=12.50; //4.6296296 
	
	//double can hold up 14-15 decimals
	double d1=2.7; //4.62962962962963
	
	
	float result=f/f1;
	double result3=d/d1;
	
	System.out.println(result);
	System.out.println(result3);
	
	int i=12;
	int y=7;
	
	int result1=i/y;
	double result2=i/y;
	
	System.out.println(result1);
	System.out.println(result2);
	
	//modulus
	
	int v=16;
	int w=7;
	
	int mod=v%w;
	System.out.println(mod);
	
	//I would like to divide 12/7
	//int num1=12.5; not possible to store decimals into int
	
	
	
	double num2=12;// we can store int into double
	double num3=7;
	
	System.out.println(num2/num3);
	
	
	
	 
	
	
	
	
	}

}
