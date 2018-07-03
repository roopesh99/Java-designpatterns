package org.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Developer> developer = new ArrayList<Developer>();
	    developer.add(new Developer("roopesh",25,100000));
	    developer.add(new Developer("srisail",26,134000));
	    developer.add(new Developer("sachin",35,200000));
	    developer.add(new Developer("rick",45,50000));
		
		developer.stream().
		filter(t->t.salary > 100000)
		.map(p->p.salary) 
		.forEach(System.out::println);
		
	    List<String> lines=Arrays.asList("roopesh","sachin","ntr");
	    
	    lines.stream().filter(t->!"roopesh".equals(t))
	    .collect(Collectors.toList()).forEach(System.out::println);
	    
	    System.out.println("------------------");
	    
	    Developer list1=developer.stream().filter(t->"roopesh".equals(t.getName())).findAny().orElse(null);
	    System.out.println(list1);
		
	    System.out.println("------------------");
	    
	    List<String> string_names=developer.stream().map(Developer::getName).collect(Collectors.toList()); //map converts stream to string
	    System.out.println(" "+string_names);
	    System.out.println("------------------");
	    
	    System.out.println("------------------");
	    List<String> up_case=Arrays.asList("a","b","c","d");
	    List<String> collect= up_case.stream().map(String::toUpperCase).collect(Collectors.toList());
	    System.out.println(collect);
	    
	    System.out.println("------------------");
	    List<String> items=Arrays.asList("apple","apple","banana","carrot","carrot","carrot");
	   Map<String, Long> result= items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	   System.out.println(result);
	}
	
}
