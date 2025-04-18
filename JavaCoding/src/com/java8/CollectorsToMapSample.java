package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMapSample {

	public static void main(String[] args) {

		List<String> numberToStrList = new ArrayList<>();
		numberToStrList.add("Six");
		numberToStrList.add("Seven");
		numberToStrList.add("Three");
		numberToStrList.add("Two");
		numberToStrList.add("Five");

		Map<String, Integer> map_sample = numberToStrList.stream().collect(Collectors.toMap(Function.identity(), String::length));
		
		System.out.println("Map_Sample.." + map_sample);

	}

}
