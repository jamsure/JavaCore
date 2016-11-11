package com.fk.javacore.threadAndrunnable;

public class Threaddemo4 {

	public static void main(String[] args) {
		Thread myThread = new MyThread1();
		System.out.println("myThread.isDaemon() : " + myThread.isDaemon());
		for (int i = 0; i < 100; i++) {
			System.out.println("main thread i = " + i);
			if (i == 20) {
				myThread.setDaemon(true);
				myThread.start();
			}
		}
		System.out.println("myThread.isDaemon() 1: " + myThread.isDaemon());
		System.out.println("myThread.isDaemon()2 : " + myThread.isDaemon());
		System.out.println("myThread.isDaemon()3 : " + myThread.isDaemon());
		System.out.println("myThread.isDaemon() 4: " + myThread.isDaemon());
		System.out.println("myThread.isDaemon() 5: " + myThread.isDaemon());
		System.out.println("myThread.isDaemon()6 : " + myThread.isDaemon());
		System.out.println("myThread.isDaemon()7: " + myThread.isDaemon());
	}

}

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("i = " + i);
			/*try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}