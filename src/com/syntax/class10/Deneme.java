package com.syntax.class10;

public class Deneme {
        public static void main(String[] args) {
        	
        	int num=10;
        	
        	int num1;
        	num1=10;
        	
        	//declare an array and initialize it and store values
        	
        	int[] array=new int[4];
        	array[0]=10;
        	array[1]=20;
        	array[2]=30;
        	array[3]=40;
        	
        	//access elements from an array
        	System.out.println(array[1]);
        	
        	//2 way
        	String[] carArray; // preferred way
        	String carArray1[];
        	//storing elements into array
        	carArray=new String[3];
        	carArray[0]="BMW";
        	carArray[1]="Honda";
        	carArray[2]="Toyota";
        	// I am drivig Toyota
        	
        	System.out.println("I am drivig "+carArray[2]);
        	/////////////////////////////
        	
        	int[] numbers=new int[3];
        	numbers[0]=100;
        	numbers[1]=200;
        	numbers[2]=300;
        	//change value of numbers[1]
        	numbers[1]=2000;
        	
        	System.out.println(numbers[1]+numbers[0]);//2100
        	
        	System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        	
        	int[] grades=new int[4];
        	grades[0]=90;
        	grades[1]=67;
        	grades[2]=89;
        	grades[3]=78;
        	
        	//what is average?
        	int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
        	System.out.println("Average grade is "+average);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
}
