package com.java8.streams.groupingBy;

import java.util.Arrays;

public class SumAvgAllElementsArray {

	public static void main(String[] args) {

		int a1[] = { 4, 1, 2, 3 };		
		//sum
		System.out.println("Sum..."+Arrays.stream(a1).sum());
		//Avg
		System.out.println("Average.. "+Arrays.stream(a1).average().getAsDouble());
	}
}
