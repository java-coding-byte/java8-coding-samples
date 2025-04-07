package com.java.innerclasses;

public class MethodLocalClass {
	void outerMethod() {

		String localVar = "I am local";

		class LocalInner {
			void print() {
				System.out.println(localVar);
			}
		}

		LocalInner local = new LocalInner();
		local.print();

	}

	public static void main(String[] args) {

		MethodLocalClass class1 = new MethodLocalClass();
		class1.outerMethod();
	}
}
