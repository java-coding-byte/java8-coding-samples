package com.java8.thread;

public class JoinDemo extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			try {
				Thread.sleep(1000); // Pause for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JoinDemo t1 = new JoinDemo();
		JoinDemo t2 = new JoinDemo();

		t1.start();
		t1.join(); // Wait for t1 to finish before starting t2

		t2.start();
	}

}
