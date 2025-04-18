package com.java8.thread;

public class RunnableLambdaExp {

	public static void main(String[] args) {

		Runnable runnable = () -> System.out.println("Runnable Thread.");
		Thread t1 = new Thread(runnable);
		t1.start();

	}

}
