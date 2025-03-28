package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
		
		List<Integer> distinctList = integerList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctList);

	}

}
