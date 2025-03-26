package com.java8;

import java.util.stream.Stream;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		System.out.println("Fibannoic series");
		Stream.iterate(
				new long[]{0, 1},
				fib -> new long[]{fib[1], fib[0] + fib[1]})
        .limit(10) // Limit to the first 10 numbers
        .map(n -> n[0]) // Extract the first element of each pair
        .forEach(System.out::println);
	}

}
