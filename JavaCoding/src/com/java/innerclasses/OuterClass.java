package com.java.innerclasses;

public class OuterClass {
	
	private String message = "Hello from OuterClass";

	class Inner {

		void showMessage() {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.Inner inner = outerClass.new Inner();
		inner.showMessage();
	}

}