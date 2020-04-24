package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		//create an arraylist to store numbers
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers.get(2));
		
		for(int i=0; i<numbers.size(); i++) {
			int num=numbers.get(i);//autounboxing
		}
		
		System.out.println(" -------------- ------------ ---------------------");
		
		for(int num: numbers) {
			System.out.println(num);
		}

	}

}
