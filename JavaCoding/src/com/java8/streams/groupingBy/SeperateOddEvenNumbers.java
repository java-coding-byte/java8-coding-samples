package com.java8.streams.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeperateOddEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		Map<Boolean, List<Integer>> map = integerList
				.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		Set<Entry<Boolean, List<Integer>>> entrySet = map.entrySet();

		for (Entry<Boolean, List<Integer>> entry : entrySet) {

			if (entry.getKey()) {
				System.out.println("Even Numbers");
			} else {
				System.out.println("Odd Numbers");
			}

			List<Integer> list = entry.getValue();
			
			for (int i : list) {
				System.out.println(i);
			}
		}
	}
}