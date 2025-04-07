package com.java8;

import java.util.Arrays;
import java.util.List;

public class PrintMultiplesofFive {
	
	public static void main(String[] args) {
		
		List<Integer> integerList=Arrays.asList(1,2,4,5,10,15,20,35);
		
		integerList.stream().filter(i->i%5==0).forEach(System.out::println);
	}

}
