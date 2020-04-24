package com.syntax.class30;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HM3 {
	
	public static void main(String[] args) {
	/*
	 * Create a Map that will store Employee name and salary. Write a logic to
	 * retrieve and employee who gets the highest salary. Output should be in the
	 * below format John Smith=$100000
	 */

	Map<String, Double> emp=new TreeMap<>();
	emp.put("John Smith", 70000.0);
	emp.put("James Adams", 80000.0);
	emp.put("William Roberts", 90000.0);
	emp.put("Adrian Foster", 10000.0);
	
	Double maxSalary=Collections.max(emp.values());
	Set<Entry<String, Double>> entries=emp.entrySet();
	for(Entry<String, Double> entry:entries) {
		if(entry.getValue()==maxSalary) {
			System.out.println(entry.getKey()+"=$"+ entry.getValue());
		}
	}
	
}
}