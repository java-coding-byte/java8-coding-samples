package com.java10;

import java.util.ArrayList;
import java.util.HashMap;

public class VarExample {
	public static void main(String[] args) {

		// Using 'var' for local variable type inference
		var i = 18;
		
		var list = new ArrayList<String>();
		
		list.add("Java 10");
		list.add("Local-Variable Type Inference");

		var map = new HashMap<String, Integer>();
		
		map.put("Java", 10);
		
		// Iterating over the map using 'var'
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		
		for (var item : list) {
			System.out.println(item);
		}

		var nums = new int[10];
		System.out.println(i);
		System.out.println(nums[0]);
	}
}
