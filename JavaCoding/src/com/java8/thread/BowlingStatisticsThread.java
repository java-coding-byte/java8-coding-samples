package com.java8.thread;

//NEW
//RUNNABLE
//RUNNING
//BLOCKED
//TERMINATED
public class BowlingStatisticsThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Running Bowling Statistic Thread.." + i);
		}
	}

	public static void main(String[] args) {
		BowlingStatisticsThread bowlingStatisticsThread = new BowlingStatisticsThread();
		bowlingStatisticsThread.start();
	}

}
