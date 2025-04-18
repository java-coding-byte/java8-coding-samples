package com.java8.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> callableTasks = List.of(new CallableTask("in28Mins"), 
				new CallableTask("Ranga"),
				new CallableTask("Sreenivasa"));

		// Future<String> welcomeFuture = executorService.submit(new
		// CallableTask("in28Minutes"));

		String invokeAnyResult = executorService.invokeAny(callableTasks);
		
		System.out.println("Invoke Any Result..." + invokeAnyResult);

		List<Future<String>> results = executorService.invokeAll(callableTasks);

		for (Future<String> result1 : results) {
			System.out.println("invokeAll..."+result1.get());
		}

		executorService.shutdown();

	}
}