package com.java.overriding.rules;

//static methods cannot be overridden (Method Hiding)
class StaticParent{
	
	static void m1() {
		System.out.println("From parent"+"static m1()");
	}
	
	void m2() {
		System.out.println("From parent"+"non-static(instance) m2");
	}
}
class StaticChild extends StaticParent{
	
	static void m1() {
		System.out.println("From child"+"static m1()");
	}
	
	public void m2() {
		System.out.println("From child"+"non-static(instance) m2");
	}
	
}
public class StaticMethodHiding {

	public static void main(String[] args) {
	
		StaticParent staticParent= new StaticChild();
		staticParent.m1();
		staticParent.m2();
		
	}
}
