package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyEachInArray {
	public static void main(String[] args) {

		String ar[] = { "a", "a", "b", "c" };

		Map<String, Long> collect = Arrays
				.asList(ar)
				.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		collect.forEach((k, v) -> System.out.println(k + "," + v));
	}
}
