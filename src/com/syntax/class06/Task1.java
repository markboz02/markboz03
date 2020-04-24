package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Ask user to enter their country and capture it.
		//once values are captured print which language user speaks.
		
		String country;
		String lang;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your country");
		
		country=scan.nextLine();
		
		switch (country.toUpperCase()) {
		case "TURKEY":
		     lang="Turkish";
		     break;
		case "USA":
			lang="English";
			break;
		case "CHINA":
			lang="Chinese";
			break;
		case "RUSSIA":
			lang="Russian";
			break;
		case "MEXICO":
			lang="Spanish";
			break;
		case "JAPAN":
			lang="Japanese";
			break;
		default:
			lang= "Unknown";
		
		}
         System.out.println("You speak "+lang);
	}

}
