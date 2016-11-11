package com.fk.javacore.threadAndrunnable;

public class ThreadDemo1 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread=Thread.currentThread();
		System.out.println("thread.getName() : "+thread.getName());
		System.out.println("thread.getId() : "+thread.getId());
		System.out.println("thread.getPriority() : "+thread.getPriority());
		System.out.println("当前毫秒数 ： "+System.currentTimeMillis());
		thread.sleep(1000);
		System.out.println("睡眠之后毫秒数 ： "+System.currentTimeMillis());
		
		System.out.println("thread.toString() : "+thread.toString());
		System.out.println("thread.MAX_PRIORITY : "+thread.MAX_PRIORITY);
		System.out.println("thread.MIN_PRIORITY : "+thread.MIN_PRIORITY);
		System.out.println("thread.NORM_PRIORITY : "+thread.NORM_PRIORITY);
		System.out.println("thread.activeCount() : "+thread.activeCount());
		System.out.println("thread.getClass() : "+thread.getClass());
		System.out.println("thread.isAlive() : "+thread.isAlive());
		System.out.println("thread.isDaemon() : "+thread.isDaemon());
		System.out.println("thread.isInterrupted() : "+thread.isInterrupted());
		
	
		}
}
