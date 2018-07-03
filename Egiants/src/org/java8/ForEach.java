package org.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ForEach {

	public static void main(String[] args) {
			
		Map<String, Integer> items = new HashMap<>();
		items.put("Roopesh", 1);
		items.put("sachin", 37000);
		items.put("ponting",20000);
	
		for(Map.Entry<String,Integer> entry: items.entrySet()) {
			System.out.println(" "+entry.getKey()+" "+entry.getValue());
		} 
	
		
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
	}
	
}
