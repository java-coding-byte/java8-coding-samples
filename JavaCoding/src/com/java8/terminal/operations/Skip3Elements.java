package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip3Elements {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(10,20,30,40);
		numbers.stream().skip(3).collect(Collectors.toList()).forEach(System.out::println);
	}

}
