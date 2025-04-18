package com.java8.thread;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

//execute method for Runnable method
public class ExecutorServiceRunnable {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		//execute for Runnable interface 1.5
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("From executor service");
			}
		});
		
		//shutdown
		executorService.shutdown();
	}
}
