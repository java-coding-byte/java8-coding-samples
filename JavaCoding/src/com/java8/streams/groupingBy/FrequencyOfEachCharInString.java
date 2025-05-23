package com.java8.streams.groupingBy;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInString {
	
	public static void main(String[] args) {
		
		String inputString="ABCCC";
		
		Map<Character, Long> frequencyCharCount =
				
				inputString.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(frequencyCharCount);		
	}
}
