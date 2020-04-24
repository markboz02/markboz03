package com.syntax.class02;

public class PerimeterAndArea {
	
	public static void main( String[] args) {
		
		int width=5;
		int height=8;
		
		int area=width*height;
		int perimeter=2*(width+height);
		
		/*
		 * The perimeter of a rectangle with widht ___
		 * and height ___is equal to ___ and the area is__"
		 */
		
		System.out.println("The perimiter of rectangle with width "+width+ ""
				+ " and height "+height+" is equal to "+perimeter+" and the area is "+area);
		
		String message="The perimiter of rectangle with width "+width+ ""
				+ " and height "+height+" is equal to "+perimeter+" and the area is "+area;
		
		System.out.println(message);
		
	}

}
