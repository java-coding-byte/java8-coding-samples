package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOfFiveList {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 40, 5, 61, 71, 80);
		List<Integer> intList = integerList.stream().
				filter(i -> i % 5 == 0)
				.collect(Collectors.toList());

		System.out.println("Int List.." + intList);
	}

}
