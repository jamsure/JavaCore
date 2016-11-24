package com.fk.javacore;

public class GitHubTest {

	String name;
	int age;
	
	public GitHubTest(String name) {
		this.name=name;
		}
	
	public void printName(Object name){
		System.out.println(name);
	}
	
	public void printName(String name){
		System.out.println("name="+ name);
	}

}
