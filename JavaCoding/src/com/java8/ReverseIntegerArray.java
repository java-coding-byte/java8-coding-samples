package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
	
	public static void main(String[] args) {
		int a1[] = { 4, 1, 2, 3 };
		int[] array = IntStream.rangeClosed(1, a1.length).map(i->a1[a1.length-i]).toArray();
		
		Arrays.stream(array).forEach(System.out::println);
	}

}
