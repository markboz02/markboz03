package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		
		for(int r=1; r<=4; r++ ) {
			
			for(int c=1; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int v=1; v<=5; v++) {          // mine own example.
			
			for(int k=1; k<=v; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("PRINTING TRIANGLE OF NUMBERS----------------------------");
          
		for(int r = 1; r <= 5; r++) {
			
			for(int c = 1; c <= r;  c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
		
	for(int r = 1; r <= 5; r++) {                 //when we put are in the print(mine comment);
			
			for(int c = 1; c <= r;  c++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}

}
