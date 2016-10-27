package com.ddb.JavaCore.base;


import java.util.Scanner;
public class Demo2 {
public static void main(String[] args) {
	int classnum=3;
	int stunum=4;
	int sum;
	double avg;
	int[][] score=new int[classnum][stunum];
	Scanner input=new Scanner(System.in);
	for(int i=0;i<classnum;i++)
	{
		for(int j=0;j<stunum;j++)
		{
			System.out.print("请输入"+(i+1)+"班，第"+(j+1)+"个同学的成绩：");
			score[i][j]=input.nextInt();
			System.out.println("第"+(i+1)+"班，第"+(j+1)+"个同学的成绩："+score[i][j]);
		}
	}
	
}
}
