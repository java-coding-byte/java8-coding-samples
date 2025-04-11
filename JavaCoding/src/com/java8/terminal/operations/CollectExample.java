package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 15, 20, 8, 30);

		List<Integer> numbersGreaterThan10 = numbers.stream().filter(num -> num > 10).collect(Collectors.toList());

		System.out.println("numbersGreater." + numbersGreaterThan10);

	}

}
