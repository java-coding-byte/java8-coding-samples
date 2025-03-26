package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
	public static void main(String[] args) {

		int a1[] = { 4, 1, 2, 3 };

		int a2[] = { 5, 8, 2, 10, 3 };

		int result[] = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2))
				.sorted()
				.distinct().toArray();

		Arrays.stream(result).forEach(s -> System.out.println(s));
	}
}
