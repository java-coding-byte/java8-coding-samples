package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DictionaryWordFinder {

	public static void main(String[] args) {

		// Sample dictionary of valid words
		Set<String> dictionary = new HashSet<>(Arrays.asList("a", "an", "and", "band", "bat", "hand", "that",
				"sand","at"));

		String input = "sandfreebandthat";

		Set<String> foundWords = findDictionaryWords(input, dictionary);

		System.out.println("Found Words..." + foundWords);

	}

	private static Set<String> findDictionaryWords(String input, Set<String> dictionary) {

		return dictionary.stream().
				filter(input::contains).
				collect(Collectors.toSet());
	}

}
