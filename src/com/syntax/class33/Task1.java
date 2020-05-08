package com.syntax.class33;

import java.util.Scanner;

public class Task1 {
	
//how would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.println("Enter a number");
			int a=scan.nextInt();
		}
		
		catch(Exception ie) {
			System.out.println("InputMismatchException");
		}

	}

}
