package com.java8.thread;

class Counter {
	
	private int count = 0;

	public void increment() {
		synchronized (this) {
			count++;
		}
	}

	public int getCount() {
		return count;
	}
}

public class SynchronizedMethod extends Thread {

	Counter counter;

	SynchronizedMethod(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			counter.increment();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		SynchronizedMethod method1 = new SynchronizedMethod(counter);
		SynchronizedMethod method2 = new SynchronizedMethod(counter);

		method1.start();
		method2.start();

		method1.join();
		method2.join();

		System.out.println("Final Count..." + counter.getCount());

	}

}
