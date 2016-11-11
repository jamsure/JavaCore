package com.fk.javacore.threadAndrunnable;

public class Tortoise implements Runnable {
	
	private int totalStep;
	private int step;
	
	public Tortoise( int totalStep) {
		this.totalStep=totalStep;
	} 
	
	@Override
	public void run() {
		while (step<totalStep) {
			step++;
			System.out.println("乌龟跑了  "+step+"  步");
		}
	}
	
}
