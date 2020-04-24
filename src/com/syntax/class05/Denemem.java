package com.syntax.class05;

import java.util.Scanner;

public class Denemem {

	public static void main(String[] args) {
	 
		Scanner scan;
		boolean sleepy;
		boolean thirsty;
		String drink;
		
		scan = new Scanner(System.in);
		System.out.println("Are you thirsty");
		thirsty = scan.nextBoolean();
		System.out.println("Are you sleepy");
		sleepy = scan.nextBoolean();
		
		if (thirsty && !sleepy) {
			drink ="water";
		}else if (thirsty && sleepy) {
			drink ="coffee";
		}else if (!thirsty && sleepy) {
			drink ="tea";
		}else {
			drink = "nothing";
		}
				
		System.out.println("Looks like you need to drink"+drink);		
		

	}

}
