package com.java8.methodreferences;

import java.util.function.Function;

public class MethodReferenceToStaticMethod {
	
	public static void main(String[] args) {
		
		//Calling parseInt static method using lambda
		
		Function<String,Integer> lambdaFunction=(String s)->Integer.parseInt(s);
		System.out.println("Lambda Function.."+lambdaFunction.apply("12"));
		
		//calling  parrseInt sttaic method using method reference
		Function<String,Integer> referenceFunction=Integer::parseInt;
		
		System.out.println(referenceFunction.apply("12"));
		
	}

}
