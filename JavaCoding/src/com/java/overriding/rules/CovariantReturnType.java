package com.java.overriding.rules;

class A {
	public A giveBirth() {
		return new A();
	}
}

class B extends A {
	@Override
	public B giveBirth() {
		return new B();
	}

}

public class CovariantReturnType {

	public static void main(String[] args) {

		A a = new A();
		A ab = a.giveBirth();
		System.out.println(ab.getClass()); // Output: class A

		B b = new B();
		B bb = b.giveBirth();
		System.out.println(bb.getClass()); // Output: class B
	}

}