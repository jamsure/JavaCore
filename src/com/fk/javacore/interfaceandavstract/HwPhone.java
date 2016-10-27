package com.fk.javacore.interfaceandavstract;

public class HwPhone extends Phone implements IPlaygames, IWatchMovie {

	@Override
	public void IwatchMovie() {
		// TODO Auto-generated method stub
		System.out.println("我可以看电影；");
	}

	@Override
	public void IPlaygames() {
		// TODO Auto-generated method stub
		System.out.println("我可以玩游戏；");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("我是"+this.getName()+",我可以发信息！");
	}

	@Override
	void call() {
		// TODO Auto-generated method stub
		System.out.println("我是"+this.getName()+",我可以发信息！");
	}

}
