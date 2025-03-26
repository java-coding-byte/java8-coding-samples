package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

public class SplitIteratorDemo {
	public static void main(String[] args) {
		Set<String> dictionary = new HashSet<>(
				Arrays.asList("a", "an", "and", "band", "bat", "hand", "hat", "sand", "at"));

		Spliterator<String> si = dictionary.spliterator();
		Spliterator<String> si1 = si.trySplit();

		// Parallel Processing
		si1.forEachRemaining(str -> System.out.println(str));
		System.out.println("************************");
		si.forEachRemaining(str -> System.out.println(str));
	}
}
