package com.java8.methodreferences;

import java.util.function.Supplier;

class Company {

	String name;

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class MethodReferenceUsingReferenceVariable {

	public static void main(String[] args) {

		Company company = new Company("Infosys");

		Supplier<String> lambdaSupplier = () -> company.getName();
		
		System.out.println("Lambda Supplier..." + lambdaSupplier.get());

		// Calling getName() of using method reference
		Supplier<String> referenceSupplier = company::getName;
		
		System.out.println("Get Name.."+referenceSupplier.get());
	}
}
