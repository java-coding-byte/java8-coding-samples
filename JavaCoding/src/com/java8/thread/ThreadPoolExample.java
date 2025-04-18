package com.java8.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//execute method to execute the task
class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing...");
	}
}

public class ThreadPoolExample {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 5; i++) {
			executor.execute(new MyTask());
		}
		executor.shutdown();
	}
}
