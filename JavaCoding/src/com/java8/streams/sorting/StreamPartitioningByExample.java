package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//List.of(1,2,3,5,9,a,6,7,8,4);
//-5 -4 -3 -2 -1
public class StreamPartitioningByExample {

	public static void main(String[] args) {

		List<Object> mixedList = Arrays.asList(1, 2, 3, 5, 9, 'a', 6, 7, 8, 4);

		// Partition elements into integers and characters
		Map<Boolean, List<Object>> partitioned = mixedList.stream()
				.collect(Collectors.partitioningBy(e -> e instanceof Integer));

		List<Integer> integers = partitioned.get(true)
				.stream().map(e -> (Integer) e).collect(Collectors.toList());

		Set<Integer> set = integers.stream().collect(Collectors.toSet());

		System.out.println("Set.." + set);

		List<Character> characters = partitioned.get(false).stream().map(e -> (Character) e)
				.collect(Collectors.toList());

		//System.out.println("Integers: " + integers);
		System.out.println("Characters: " + characters);
		
		List<Integer> list= List.of(-5, -4, -3, -2, -1);
		
		list.stream().sorted((a,b)->b-a).collect(Collectors.toList()).forEach(System.out::println);;
		
	}

}
