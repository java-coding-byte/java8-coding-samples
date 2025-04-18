package com.java8;

import java.util.stream.IntStream;

public class SumFirst10NaturalNumbers {
	
	public static void main(String[] args) {
		int sum=IntStream.range(1,9).sum();
		//1,2 3,4 5,6,7,8,9
		System.out.println("Sum.."+sum);
	}

}
