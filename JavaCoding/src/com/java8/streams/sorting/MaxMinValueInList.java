package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.List;

public class MaxMinValueInList {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int max = numbers.stream().max(Integer::compareTo).get();
		
		System.out.println(max);
		
		int min = numbers.stream().min(Integer::compareTo).get();
		
		System.out.println(min);
		
	}
}
