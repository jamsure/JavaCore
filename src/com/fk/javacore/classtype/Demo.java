package com.fk.javacore.classtype;

import lombok.Data;

@Data
public class Demo {
	private String name;
	private int age;
	
	public Demo getNewDemo(Demo other) {
		Demo demo=new Demo("zhansan", 20);
		other=demo;
		return other;
	}

	public Demo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Demo demo=new Demo("lasi", 100);
		Demo demo2=new Demo("·······", 55);
		
		System.out.println(demo);
		System.out.println(demo2);
		System.out.println(demo.getNewDemo(demo));
		System.out.println(demo);
		System.out.println();
		demo2.setName(demo.getName());
		System.out.println(demo2);
		demo2.setName("--------");
		System.out.println(demo);
		System.out.println(demo2);
		
		
	}
}
