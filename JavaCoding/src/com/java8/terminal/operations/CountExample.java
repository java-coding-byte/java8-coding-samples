package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class CountExample {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Hi", "hello", "World", "Java");

		// count words greater than 3
		long count = words.stream().filter(word -> word.length() > 3).count();
		System.out.println("Count.." + count);
	}

}
