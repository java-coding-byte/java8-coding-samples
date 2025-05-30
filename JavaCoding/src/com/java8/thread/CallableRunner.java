package com.java8.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//submit method for Callable task

class CallableTask implements Callable<String> {

	private String name;

	CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello.." + name;
	}
}

public class CallableRunner {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Future<String> welcomeFuture = executorService.submit(new CallableTask("Sreenivasa"));

		System.out.println("Welcome Future.."+welcomeFuture.get());

		System.out.println("\n Main Completed");

		executorService.shutdown();

	}
}
