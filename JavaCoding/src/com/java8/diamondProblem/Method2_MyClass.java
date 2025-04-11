package com.java8.diamondProblem;

interface InterfaceOne2 {

	default void anyMethod() {
		System.out.println("Hi.. From InterfaceOne2 One");
	}
}

interface InterfaceTwo2 extends InterfaceOne2 {

	default void anyMethod() {
		System.out.println("Hi... From InterfaceTwo2 Two");
	}
}

public class Method2_MyClass implements InterfaceOne2, InterfaceTwo2 {
	
	public static void main(String[] args) {
		new Method2_MyClass().anyMethod();
	}
}
