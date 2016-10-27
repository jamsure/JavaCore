package com.fk.javacore.interfaceandavstract;

public class Ship extends Transportation {
	public Ship() {
		// TODO Auto-generated constructor stub
	}
	public Ship(String name, Integer seat, String way) {
		super(name, seat, way);
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("我是 ： "+this.getName()+" ，有"+this.getSeat()+"个座位,运输方式是："+this.getWay());

	}

}
