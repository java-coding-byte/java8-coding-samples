package com.java8;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5, 5, 3, 7, 8, 9);
		
	  System.out.println("List of Integers.."+listOfIntegers.stream().distinct().collect(Collectors.toList()));

		HashSet<Integer> seen = new HashSet<>();
		
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : listOfIntegers) {

			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}

		System.out.println("Duplicate elements .." + duplicates);
	}

}