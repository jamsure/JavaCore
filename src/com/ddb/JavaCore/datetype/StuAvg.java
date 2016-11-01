package com.ddb.JavaCore.datetype;

import java.util.Arrays;
import java.util.Scanner;

public class StuAvg {

	public static void main(String[] args) {
		
		int classNum = 3;
		int stuNum = 4;
		double sum = 0;
		double avg = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= classNum; i++) {
			sum = 0;
			System.out.println("***请输入第" + i + "个班级的成绩：***");
			for (int j = 1; j <=stuNum; j++) {
				System.out.print("第" + j + "名同学：");
				int score = input.nextInt();
				sum = sum + score;
			}
			avg = sum / stuNum;
			System.out.println("第" + i + "个班级的平均分：" + avg+"\n");
		}
		System.out.println("*****谢谢使用*****");
	}

}
