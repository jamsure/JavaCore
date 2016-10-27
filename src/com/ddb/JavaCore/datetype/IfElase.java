package com.ddb.JavaCore.datetype;

import java.io.PrintStream;

public class IfElase {

	
	
	public static void main(String[] args) {
		PrintStream out=System.out;
		int x=10;
		while(x<20)
		{
			System.out.println(x++);
			
		}
		System.out.println(x);
		
		
		//foreach
		out.println();
		out.println("foreach循环：");
		int[] arry={11,22,33,44,55,66,77};
		for (int i : arry) {
			out.println(i);
		}
		
		//for 循环
		out.println();
		out.println("for循环：");
		for (int i = 0; i < arry.length; i++) {
			
			out.println(arry[i]);
		}
		
		
		//coutinue break return
		
		out.println();
		int sum1=0,sum2=0;
		out.println("coutinue break return 演示::");
		for(int i=1;i<=5;i++){
			out.println("外部循环："+i);
			for(int j=1;j<=10;j++){
				if(j==3){
					out.println("\t\tcontinue 第三次循环跳过！");
					continue;
				}
				if (j==7) {
					out.println("\t\tbreak 第七次跳出内部循环！");
					break;
				}
				out.println("\t内部循环："+j);
			}
		}
		
		
		//乘法口诀表
		out.println();
		out.println();
		for (int i = 1; i<10; i++) {
			for(int j=1; j<=i;j++)
			{
				out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			out.println();
		}
	//Math.sqrt();
		//aX^2+bX+c=0
		//x1=(-b+sqrt(b^2-4*a*c))/2*a
		//x2=(-b-sqrt(b^2-4*a*c))/2*a
		IfElase xy=new IfElase();
		out.println();
		out.println("解方程 -3X^2+5X+7=0 ");
		double[] y=new double[2]; 
		y=xy.resu(-3, 5, 7);
		out.println("结果为:");
		out.println("x1="+y[0]);
		out.println("x2="+y[1]);
		
		
		
		
		
	}
	
	public double[] resu(double a,double b,double c){
		double[] x=new double[2];
		x[0]=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x[1]=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		return x;
		
	}
	
}
