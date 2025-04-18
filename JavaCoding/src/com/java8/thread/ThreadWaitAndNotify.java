package com.java8.thread;

class Calculator extends Thread {

	long sum;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				sum += i;
			}
			notify();

		}
	}
}

public class ThreadWaitAndNotify {

	public static void main(String[] args) {

		Calculator thread = new Calculator();
		thread.start();
		
		synchronized (thread) {
			try {
				thread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(thread.sum);

	}
}
