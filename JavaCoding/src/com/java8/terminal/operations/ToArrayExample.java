package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		String[] array = names.stream().toArray(String[]::new);

		System.out.println("Array.." + Arrays.toString(array));
	}

}
