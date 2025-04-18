package com.java8.methodreferences;

import java.util.function.Supplier;

class Comp {

	Comp() {
		System.out.println("In Cons");
	}
}

public class MethodReferenceConstructor {
	public static void main(String[] args) {

		Supplier<Comp> lambaSupplier = () -> new Comp();
		System.out.println("Lamba Supplier..." + lambaSupplier.get());

		// Comp new constructor
		Supplier<Comp> referenceSupplier = Comp::new;
		System.out.println("Constructor Reference Supplier .." + referenceSupplier.get());

	}
}
