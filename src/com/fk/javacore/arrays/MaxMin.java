package com.fk.javacore.arrays;

import java.io.PrintStream;
import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		PrintStream out = System.out;
		int[] intArrays = { 25, 1, 27, 3, 79 };
		int[] intCopy = new int[10];
		out.println("输出数组：");
		for (int i : intArrays) {
			out.print(" " + i);
		}
		int max, min;
		max = intArrays[0];
		min = intArrays[0];
		for (int i = 0; i < intArrays.length; i++) {
			if (max < intArrays[i]) {
				max = intArrays[i];
			}
			if (min > intArrays[i]) {
				min = intArrays[i];
			}
		}
		out.println();
		out.println("最大数为：" + max);
		out.println("最小数为：" + min);
		out.println();
		out.println("排序后的数组：");
		Arrays.sort(intArrays);
		for (int i : intArrays) {
			out.print(" " + i);
		}
		out.println();
		System.arraycopy(intArrays, 1, intCopy, 1, 3);
		out.println("复制一个数组：");
		for (int i : intCopy) {
			out.print(" " + i);
		}
		out.println();
		out.println("生成一个随机数组并输出:");		
		int[] intRandom=new int[20];
		for(int i=0;i<intRandom.length;i++){
			intRandom[i]=(int)(Math.random()*100);
		}
		for (int i : intRandom) {
			out.print(" "+i);
		}

	}

	public static void createIsoscelesTriangle4(int x) {
			int a = (x + 1) / 2;
			System.out.println("param is :" + x + " mid is :" + a);
			System.out.println("Isosceles triangle :");
			for (int i = 1; i <= a; i++) {
				if (i == 1) {
					for (int n = 1; n <= x; n++) {
						System.out.print("*");
					}
				} else {
					for (int j = 1; j <= (x - i + 1); j++) {
						if(j<i){
							System.out.print(" ");
						}else{
							System.out.print("*");
						}
					}
				}
				System.out.println();
			}
		}

}
