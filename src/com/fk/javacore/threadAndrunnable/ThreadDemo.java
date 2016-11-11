package com.fk.javacore.threadAndrunnable;

public class ThreadDemo {
	public static void main(String[] args) {
		
	Tortoise tortoise = new Tortoise(10);
	Hare hare = new Hare(10);
	Thread tortoiseThread=new Thread(tortoise);
	Thread hareThread=new Thread(hare);
	tortoiseThread.start();
	hareThread.start();
	
	
	}
}
