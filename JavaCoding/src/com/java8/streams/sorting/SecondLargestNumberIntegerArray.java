package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumberIntegerArray {
	
	public static void main(String[] args) {
		List<Integer> listOfIntegers=Arrays.asList(1,2,3,4,5,6,7,8);
		Integer second=listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println("Second.."+second);
	}

}
