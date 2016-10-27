package com.fk.javacore.interfaceandavstract;

import lombok.Data;

@Data
public abstract class Phone {
	private String name;
	private String model;
	private String screen;
	
	public abstract void message();
	abstract void  call();
}
