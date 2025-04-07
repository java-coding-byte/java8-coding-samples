package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxMinNumbers {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println("Minimum 3 Numbers");

		System.out.println("-----------------");

		listOfIntegers.stream().limit(3).sorted().forEach(System.out::println);

		System.out.println("Maximum 3 Numbers");
		System.out.println("-----------------");
		listOfIntegers.stream().limit(3).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	}

}
