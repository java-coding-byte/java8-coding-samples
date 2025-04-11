package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("ALice","Bob","Charlie");
		
		//Print all names 
		names.stream().forEach(System.out::println);
	}

}
