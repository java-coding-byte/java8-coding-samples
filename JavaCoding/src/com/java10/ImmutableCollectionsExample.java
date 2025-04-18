package com.java10;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionsExample {
	
	public static void main(String[] args) {
		
		// These methods create unmodifiable copies of existing collections.
		// List.copyOf(), Set.copyOf(), and Map.copyOf()

		List<String> originalList = List.of("A", "B", "C");//Java 9 unModifiedList
		
		List<String> immutableList = List.copyOf(originalList);//Java 10

		Set<String> originalSet = Set.of("X", "Y", "Z");//Java 9
		
		Set<String> immutableSet = Set.copyOf(originalSet);

		Map<String, Integer> originalMap = Map.of("One", 1, "Two", 2);
		
		Map<String, Integer> immutableMap = Map.copyOf(originalMap);

		System.out.println("Immutable List: " + immutableList);
		System.out.println("Immutable Set: " + immutableSet);
		System.out.println("Immutable Map: " + immutableMap);
	}

}