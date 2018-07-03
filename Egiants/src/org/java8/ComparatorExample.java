package org.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	
	public static class sortbyage implements Comparator<Developer>{

		
		@Override
		public int compare(Developer o1, Developer o2) {
			
			return o1.age-o2.age;
		}

		
	}
	
	public static void main(String[] args) {
		
		List<Developer> developer=new ArrayList<Developer>();
		developer.add(new Developer("roopesh",100,10000));
		developer.add(new Developer("kumar",10,20000));
		developer.add(new Developer("aravind",200,444555));
		developer.add(new Developer("srisail",150,30000));
		
		
		for(Developer d:developer) {
			System.out.println(d.name+" "+d.age);			
		}
		
	
		
		developer.sort((Developer o1,Developer o2)->o1.getAge()-o2.getAge());
		
		System.out.println("After sorting");
		
		for(Developer d:developer) {
			System.out.println(d.name+" "+d.age); 
		}
		
	}
	
}
