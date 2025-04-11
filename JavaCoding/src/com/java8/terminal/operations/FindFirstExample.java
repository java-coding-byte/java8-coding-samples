package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 12, 8, 30);
		
		Optional<Integer> first=numbers.stream().filter(num->num>10).findFirst();
		
		first.ifPresent(num->System.out.println("First Num >10...."+num));
		
		
	}

}
