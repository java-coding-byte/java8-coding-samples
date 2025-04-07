package com.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordOfString {
	
	public static void main(String[] args) {
		String str="abc";
		String reverseString = Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println("Reverse String.."+reverseString);
		
	}

}
