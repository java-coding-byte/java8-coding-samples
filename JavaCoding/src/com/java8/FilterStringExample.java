package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringExample {
	public static void main(String[] args) {
		
		//List of String
		List<String> names=Arrays.asList("Alice","Bob","Charlie","David","Eve");
		//Names greater than 3
		names.stream().filter(name->name.length()>3).collect(Collectors.toList()).forEach(System.out::println);;
	}
}
