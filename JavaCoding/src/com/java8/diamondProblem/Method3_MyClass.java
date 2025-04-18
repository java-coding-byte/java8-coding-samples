package com.java8.diamondProblem;

interface Interface31 {

	default void anyMethod() {
		System.out.println("Hi .. From Interface 31");
	}
}

interface Interface32 {

	default void anyMethod() {
		System.out.println("Hi .. From Interface 32");
	}
}

public class Method3_MyClass implements Interface31, Interface32 {

	@Override
	public void anyMethod() {
		System.out.println("anyMethod..");
	}

	public static void main(String[] args) {
		new Method3_MyClass().anyMethod();
	}

}
