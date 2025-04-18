package com.java8.methodreferences;

import java.util.function.Function;

public class MethodReferenceToInstanceMethod {

	public static void main(String[] args) {

		// Calling toLowerCase() instance method using lambda
		Function<String, String> lambdaFunction = (String s) -> s.toLowerCase();
		System.out.println(lambdaFunction.apply("JAVA"));

		// Calling toLowerCase() instance method using method reference

		Function<String, String> referenceFunction = String::toLowerCase;
		System.out.println(referenceFunction.apply("JAVA"));
	}

}
