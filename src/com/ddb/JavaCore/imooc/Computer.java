package com.ddb.JavaCore.imooc;

public class Computer {
	String name="联想品牌";
	float price=3000f;
	String type="台式机";
	int var=5;
	void surf(){
		System.out.println("可以上网冲浪！");
		
		System.out.println("电脑品牌为："+name+"  价格为："+price+"  机型为："+type);
		
	}
	
	void game(){
		int var=20;
		System.out.println("可以玩游戏!");
		System.out.println(var);
	}
}
