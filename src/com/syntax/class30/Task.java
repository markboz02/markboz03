package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task {
	
	public static void main(String[] args) {
		
		Map<String, String> task=new TreeMap<>();
		task.put("Turkey", "Adana");
		task.put("Kazakistan", "Astana");
		task.put("Russia", "Moscow");
		task.put("USA", "Atlanta");
		task.put("England", "Liverpool");
		System.out.println(task.keySet());
		for (String newTask : task.keySet()) {
			System.out.println(newTask);
		}
		
		System.out.println("=========Iterator=================");
		Iterator <String>l = task.keySet().iterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		
		
	}

}
