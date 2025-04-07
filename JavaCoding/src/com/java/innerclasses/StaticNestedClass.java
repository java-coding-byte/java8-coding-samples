package com.java.innerclasses;

public class StaticNestedClass {
	
	static String staticMessage="Static Nested Class Message";
	
	static class StaticNested{
		
		void display() {
			System.out.println(staticMessage);
		}
	}
	
	public static void main(String[] args) {
		StaticNestedClass.StaticNested staticNested= new StaticNestedClass.StaticNested();
		staticNested.display();
	}
}
