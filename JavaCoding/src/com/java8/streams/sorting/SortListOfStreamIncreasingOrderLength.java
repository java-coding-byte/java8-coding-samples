package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStreamIncreasingOrderLength {
	
	public static void main(String[] args) {
		
		List<String> listOfStream= Arrays.asList("sree","kingggg","swathi","dictionary");
		listOfStream.stream()
		.sorted(Comparator.comparing(String::length))
		.forEach(System.out::println);
		
	}

}
