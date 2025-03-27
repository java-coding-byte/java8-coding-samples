//Use Stream API for filtering, grouping, and sorting.
//Use lambda expressions and method references.
//Use Collectors for grouping and summarizing.
//Ensure the code is clean and follows Java 8 standards.

//Top Customers:
//1. Customer: C2, Total Order Value: 3800.0
//2. Customer: C1, Total Order Value: 1500.0
//3. Customer: C4, Total Order Value: 2500.0

package com.java8.streams.groupingBy;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortOrderList {
	
	public static void main(String[] args) {
				
		List<Order> orders = Arrays.asList(
				new Order("O1", "C1", 1500.0, LocalDate.of(2023, 6, 15)),
				new Order("O2", "C2", 2000.0, LocalDate.of(2022, 4, 10)),
				new Order("O3", "C1", 1200.0, LocalDate.of(2021, 5, 20)),
				new Order("O4", "C3", 800.0, LocalDate.of(2020, 12, 25)),
				new Order("O5", "C2", 1800.0, LocalDate.of(2023, 8, 1)),
				new Order("O6", "C4", 2500.0, LocalDate.of(2023, 1, 12))
				);
		
		 Map<String, Double> totalSpending = orders.stream()
	                .collect(Collectors.groupingBy(
	                        Order::getCustomerId,
	                        Collectors.summingDouble(Order::getOrderValue)
	                ));

		
		List<Map.Entry<String, Double>> topCustomers = totalSpending.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()) 
                // Sort by highest spending
                .limit(3) // Get top 2 customers
                .collect(Collectors.toList());
		
		System.out.println("Total Spending.."+totalSpending);
		
		System.out.println("Top Customers..."+topCustomers);
		
	}
	
}
