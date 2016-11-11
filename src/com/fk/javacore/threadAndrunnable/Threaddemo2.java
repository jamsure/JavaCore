package com.fk.javacore.threadAndrunnable;

public class Threaddemo2 {

	public static void main(String[] args) {

		MyRunnable1 myRunnable = new MyRunnable1();
		Thread thread = new Thread(myRunnable);

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 30) {
				thread.start();
			}
			if (i == 40) {
				myRunnable.stopThread();
			}
		}
	}
}

class MyRunnable1 implements Runnable {

	private boolean stop;

	@Override
	public void run() {
		for (int i = 0; i < 100 && !stop; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public void stopThread() {
		this.stop = true;
	}
}