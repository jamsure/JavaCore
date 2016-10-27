package com.ddb.JavaCore.datetype;

import java.io.PrintStream;
import java.util.*;

public class Chord {
	public static void main(String args[]) {
		PrintStream out=System.out;
//		Scanner in = new Scanner(System.in);
//		int x;
//		System.out.println(" 请输入要求的素数范围：");// 加入一个提示语句
//		x = in.nextInt();
//		System.out.println(" 1到" + x + "内的素数有：");
//		int i, n;
//		for (i = 2; i <= x; i++) {
//			for (n = 2; n <= (int) Math.sqrt(i); n++)
//				// 核心语句：内层变量<=(int)Math.sqrt(外层变量)
//				if (i % n == 0)
//					break;
//			if (n > (int) Math.sqrt(i))
//				System.out.print(" " + i);// s
//		}
		
		/*JAVA中，用开方法计算出1到任意整数段的素数，
		*这利用了一个定义：如果一个数不是素数且不等于1，
		*那么它的最小质因数小于等于他的平方根。
		*/
		out.println();
		Scanner input=new Scanner(System.in);
		out.print("请输入要求的素数范围：");
		int xx=input.nextInt();
		out.println("1到"+xx+"内的素数有：");
		int j,k;
		for(j=2;j<=xx;j++){
			for(k=2;k<=(int)Math.sqrt(j);k++){
				if(j%k==0)
					break;
				}
			if(k>(int)Math.sqrt(j))
				out.print(" "+j);
				
			}
		}
		/*int xx;
		System.out.println(" 请输入要求的素数范围：");// 加入一个提示语句
		xx = in.nextInt();
		System.out.println(" 1到" + xx + "内的素数有：");
		int j, k;
		for (j = 2; j <= xx; j++) {
			for (k = 2; k <= (int) Math.sqrt(j); k++)
				// 核心语句：内层变量<=(int)Math.sqrt(外层变量)
				if (j % k == 0)
					break;
			if (k > (int) Math.sqrt(j))
				System.out.print(" " + j);// s
		}
		*/
		
		
				
		
	}
