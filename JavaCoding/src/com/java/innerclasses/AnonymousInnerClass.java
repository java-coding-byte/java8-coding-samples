package com.java.innerclasses;

abstract class Animal {
	abstract void sound();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Animal dog = new Animal() {

			@Override
			void sound() {
				System.out.println("Woof..");
			}
		};
		dog.sound();
	}
}