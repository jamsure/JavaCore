package com.fk.javacore;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GitHubDemo1 {

	public static void main(String[] args) {
		GitHubTest gitHubTest=new GitHubTest("f-k");
		gitHubTest.printName("sssss");
		gitHubTest.printName("bbbbb");
		gitHubTest.printName(gitHubTest);
		Thread thread=Thread.currentThread();
		System.out.println(thread.getId());
		Lock lock =new ReentrantLock();
		
	}

}
