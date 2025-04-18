package com.java8.thread;

public class BowlingStatisticsRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("BowlingStatisticRunnable..");
	}

	public static void main(String[] args) {

		BowlingStatisticsRunnable bowlingStatisticsRunnable = new BowlingStatisticsRunnable();
		Thread th = new Thread(bowlingStatisticsRunnable);
		th.start();
	}

}
