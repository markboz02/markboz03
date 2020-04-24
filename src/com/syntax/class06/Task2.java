package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/* Allow user to enter grade and then provide explanation:
		 * A - Excellent, B-Good, C-Average, D-Bad,
		 * any other grade --> Not Acceptable.
		 * At the end your program should
		 * print which grade was entered by a user with explanation.
		 */
		 
		char grade;
		String result;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		
		grade = scan.next().charAt(0);
		
		switch (grade) {
		case 'A':
			result = "Excelent";
			break;
		case 'B':
			result = "Good";
			break;
		case 'C':
			result = "Avarage";
			break;
		case 'D':
			result ="Bad";
			break;
		default:
			result = "Invalid";
			
		}
		
       System.out.println("Your grade "+grade+" You are "+result);
	}

}
