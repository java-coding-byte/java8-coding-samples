package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListReverseOrder {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
		
		List<Integer> list = integerList.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println("List..." + list);
	}

}
