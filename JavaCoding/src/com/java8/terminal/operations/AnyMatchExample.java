package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 45, 8);

		boolean allEven = numbers.stream().anyMatch(num -> num > 50);

		System.out.println("isEven.." + allEven);
	}

}
