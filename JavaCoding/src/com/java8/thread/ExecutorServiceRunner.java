package com.java8.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		
		System.out.println("\nTask" + number + "Started");
		
		for (int i = number*100; i <= number * 100 + 99; i++) {
			System.out.println(i + " ");
		}
		System.out.println("Task" + number + "Done");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		
		executorService.shutdown();
	}

}
