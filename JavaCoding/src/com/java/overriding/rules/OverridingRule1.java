package com.java.overriding.rules;

//A Simple Java program to demonstrate
//Overriding and Access-Modifiers
//An overriding method’s access modifier in a subclass can be more permissive (e.g., protected to the public) than the overridden method in the superclass. 
//However, reducing the access level (e.g., making a protected method private) is not allowed and will result in a compile-time error.
class Parent {

	private void m1() {
		System.out.println("From parent m1()");
	}

	protected void m2() {
		System.out.println("From parent m2()");
	}
}

class Child extends Parent {
	private void m1() {
		System.out.println("From parent m1()");
	}

	// overriding method
	// with more accessibility
	@Override
	public void m2() {
		System.out.println("From child m2()");
	}
}

public class OverridingRule1 {
	public static void main(String[] args) {
		// parent class object
		Parent P = new Parent();
		P.m2();
		
		// child class object
		Parent C = new Child();
		C.m2();
	}
}
