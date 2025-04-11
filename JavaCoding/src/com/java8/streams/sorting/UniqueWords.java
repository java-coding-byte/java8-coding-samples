package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWords {

	public static void main(String[] args) {

		String str = "Java is fun and Java is powerful";

		List<String> uniqueWords = Arrays.stream(str.split(" ")).map(String::toLowerCase).distinct().sorted()
				.collect(Collectors.toList());

		System.out.println(uniqueWords);
	}

}
