package org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamtoArray {
  public static void main(String[] args) {
	 String[] array= {"a","b","c","d"};
	 
	 Stream<String> stream1=Arrays.stream(array);
	 stream1.forEach(t->System.out.println(t));
	 
	 long count=stream1.filter(t->"b".equals(t)).count(); // reusing of stream is not possible due to closing of stream.
	 System.out.println(count);
	
	  
  }
	
}
