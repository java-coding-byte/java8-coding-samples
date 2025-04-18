package com.java8.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
public static void main(String[] args) {
	
	List<Integer>  numbers=Arrays.asList(1,2,3,4,5);
	numbers.stream().peek(n->System.out.println(n))
	.map(n->n*2)
	.peek(n->System.out.println("After "+n))
	.collect(Collectors.toList());
}
}
