package com.java8.diamondProblem;

interface InterfaceOne {

	default void anyMethod() {
		System.out.println("Hi ... From Interface One");
	}
}

interface InterfaceTwo extends InterfaceOne {

	default void anyMethod() {
		System.out.println("Hi .. From Interface Two");
	}
}

class ClassOne implements InterfaceOne, InterfaceTwo {

	public void anyMethod() {
		System.out.println("Hi ... From Class One");
	}
}

public class Method1_MyClass extends ClassOne implements InterfaceOne, InterfaceTwo {
	public static void main(String[] args) {
		new Method1_MyClass().anyMethod();
	}
}