package com.java8.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> callableTasks = List.of(new CallableTask("in28Mins"), new CallableTask("Ranga"));

		Future<String> welcomeFuture = executorService.submit(new CallableTask("in28Minutes"));

		String result = welcomeFuture.get();

		System.out.println("Result.." + result);

		List<Future<String>> invokeAll = executorService.invokeAll(callableTasks);

		for (Future<String> future : invokeAll) {
			System.out.println(future.get());
		}

		executorService.shutdown();

	}
}
