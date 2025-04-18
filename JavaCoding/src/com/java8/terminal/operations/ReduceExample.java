package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 15, 20, 8, 30);
		
		//find the sum of all numbers in a list
		int sum=numbers.stream().reduce((a,b)->a+b).get();
		
		System.out.println("Sum.."+sum);
	}

}
