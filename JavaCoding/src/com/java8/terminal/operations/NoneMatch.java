package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Hi", "hello", "World", "Java");

		boolean flag = words.stream().noneMatch(name -> name.startsWith("Z"));
		
		System.out.println("Flag.."+flag);
	}

}
