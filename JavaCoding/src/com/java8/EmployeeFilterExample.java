package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilterExample {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Alice", 30), new Employee("Charlie", 20),
				new Employee("Bob", 25), new Employee("David", 28));

		List<Employee> empList = employees.stream().filter(emp -> emp.getAge() > 20).collect(Collectors.toList());

		List<String> names = employees.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		
		System.out.println("Names.." + names);

		System.out.println("Emp List.." + empList);
	}

}
