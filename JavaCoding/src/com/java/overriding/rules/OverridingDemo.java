package com.java.overriding.rules;

class Animal {
	//overriden method
	void move() {
		System.out.println("Animal is moving");
	}

	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {

	//overriding
	void move() {
		System.out.println("Dog is running");
	}

	void bark() {
		System.out.println("Dog is barking");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
			Dog d = new Dog();
			d.move();
			d.bark();
			d.eat();
	}
}
