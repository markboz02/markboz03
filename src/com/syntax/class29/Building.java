package com.syntax.class29;

import java.util.HashMap;

//Create a map of a building. Store floor number and it is associated company name. 
/*(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
1.Check how many entries you have?
2.Update company on a 4th floor 
3.Remove company on the 7th floor
4.Print your map*/

public class Building {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> floor = new HashMap<>();
		floor.put(1, "Google");
		floor.put(2, "Syntax");
		floor.put(3, "Facebook");
		floor.put(4, "Twitter");
		floor.put(5, "Amazon");
		floor.put(6, "Instagram");
		floor.put(7, "Salesforce");
		
		System.out.println(floor);
		System.out.println("How many elements do I have = "+floor.size());
		
		floor.replace(4, "Yandex");//update the company to the 4th floor
		
		System.out.println(floor);
		floor.remove(7);//Remove 7th floor
		System.out.println(floor);//print the map
	}
	

}
