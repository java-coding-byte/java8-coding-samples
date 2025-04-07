package com.java10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiableCollectorsExample {

	public static void main(String[] args) {
		
		List<String> list = Stream.of("Java", "10", "Features").collect(Collectors.toUnmodifiableList());
		
		System.out.println("Unmodifiable List: " + list);
		
		 Set<String> set = Stream.of("A", "B", "C").collect(Collectors.toUnmodifiableSet());
		 
		 System.out.println("UnModifiable Set.."+set);
		 
		  Map<String, Integer> map = Stream.of("One", "Two")
                  .collect(Collectors.toUnmodifiableMap( s -> s, s -> s.length()));
		  
		  System.out.println("UnModifiable Map.."+map);	
	}
}
