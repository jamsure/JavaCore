package com.fk.javacore.interfaceandavstract;

public class Bus extends Transportation {

	
	public Bus() {
		super();
		System.out.println("我是Bus类的构造方法！");
		// TODO Auto-generated constructor stub
	}
	public Bus(String name, Integer seat, String way) {
		super(name, seat, way);
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("我是  "+this.getName()+" ，有"+this.getSeat()+"个座位,运输方式是："+this.getWay());
	}

}
