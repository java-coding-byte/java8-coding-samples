package com.java8.streams.groupingBy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsNumber {
	
	public static void main(String[] args) {
		
		 int i = 15623;
		 
	     Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));     
	     
	     System.out.println(sumOfDigits);
	}

}
