package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
	
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,4,6,8);
		
		boolean allEven=numbers.stream().allMatch(num->num%2==0);
		
		System.out.println("isEven.."+allEven);
	}

}
