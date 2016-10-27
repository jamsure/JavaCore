package com.fk.javacore.interfaceandavstract;

import lombok.Data;

@Data
public abstract class Transportation {
	private String name="船";
	private Integer seat;
	private String way;
	public abstract void  work();
	
	private Bigbus bigbus;
	public Bigbus getInnerInstence() {
		if (bigbus == null) {
			bigbus = new Bigbus();
		}
		return bigbus;
	}
	
	public Transportation(String name, Integer seat, String way) {
		super();
		this.seat = seat;
		this.name = name;
		this.way = way;
	}

	public Transportation() {
		super();
		System.out.println("我是Transportation抽象类的构造方法");
	}
	public class Bigbus{
		void play(){
			System.out.println("内部方法:"+name);
		}
	}
	
}
