package com.fk.javacore.weektest;

/**
 * 
 * 公鸡每只5元，母鸡每只3元，小鸡一只1元，
 * 
 *
 */

public class Chicken {
	public static void buyChicken(int x) {
		System.out.println("Money ： " + x + "  Count ： " + x);
		for (int a = 0; a < x / 5; a++) {							 //公鸡数量
			for (int b = 0; b < x / 3; b++) {						//母鸡数量
				int c = x - a - b;									//小鸡数量
				if ((c % 3 == 0) && (5 * a + b * 3 + c / 3 == x)) {  
					System.out.println("公鸡数 ： " + a);
					System.out.println("母鸡数 ： " + b);
					System.out.println("小鸡数 ： " + c);
					System.out.println("---------------");
				}
			}
		}
	}	

	public static void main(String[] args) {
		buyChicken(100);
		buyChicken(200);
	}
}
