package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class HW2 {
	
	public static void main(String[] args) {
//   Create a Map from array of cities that will sort keys in alphabetical order.
//   As a key store the name of the city and as a value store the length of the city
//   (Example: Paris=5, Moscow =6, Washington DC=13 etc..),
//   If any city name is more than 7 characters remove that city.
		
		Map<String, Integer> city = new TreeMap<>();
		city.put("Adana", 100);
		city.put("Atlanta", 101);
		city.put("UlanBaatar", 102);
		city.put("Miami", 103);
		city.put("Arizona", 104);
		city.put("Los Angeles", 105);
		
		Set<Entry<String, Integer>> list = city.entrySet();
		Iterator<Entry<String, Integer>> h = list.iterator();
		while (h.hasNext()) {
			Entry<String, Integer> k = h.next();
			if (k.getKey().length() > 7) {
				h.remove();
			}
		}
		System.out.println(city);
		
	}

}
