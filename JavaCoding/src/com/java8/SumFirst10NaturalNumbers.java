package com.java8;

import java.util.stream.IntStream;

public class SumFirst10NaturalNumbers {
	
	public static void main(String[] args) {
		int sum=IntStream.range(1,11).sum();
		
		System.out.println("Sum.."+sum);
	}

}
