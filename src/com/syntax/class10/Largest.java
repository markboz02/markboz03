package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		
		//find largest element from an array
		int[] nums= {200, 30, -1, 900, 56, 787, 3000};
		
		int largest=nums[0];//200
		
		for(int i=1; i<nums.length; i++) {
			
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
		
		System.out.println("Largest num is "+largest);

		System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
		
		//find largest element from an array
		int[] num1= { 250, 350, 460, 60, 65, 98};
		
		int largestt=num1[0];//250
		
		for(int i=1; i<num1.length; i++) {
			
			if(num1[i]>largestt) {
				largestt=num1[i];
			}
		}
		System.out.println("Largestt num1 is "+largestt);
	}

}
