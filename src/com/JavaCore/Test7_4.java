package com.JavaCore;

public class Test7_4 {

	/*
	 * 任务
一、 定义一个无参带返回值的方法，实现输出学生年龄的最大值

提示：
 1、 定义一个整形数组 ages ，保存学生年龄，数组元素依次为 18 ,23 ,21 ,19 ,25 ,29 ,17
 2、 定义一个整形变量 max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大值
 3、 使用 for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大值
 4、 使用 return 返回最大值
二、 完成 main 方法

提示：
 1、 调用自定义方法，将方法返回值保存在变量 maxScore 中
 2、 输出变量结果
	 * */
	public static void main(String[] args) {
		int[] ages={18,23,21,19,25,29,17};
		int max=ages[0];
		System.out.print("学生的年龄分别为：");
		for(int x:ages){
			System.out.print(x+" ");
		}
		System.out.println();
		Test7_4 stu=new Test7_4();
		int maxAge=stu.maxAge(ages, max);
		System.out.println("年龄最大的是："+maxAge);
		
		System.out.println();
		System.out.println();
		System.out.println();
		stu.Avg(94, 81);
	}


	public int maxAge(int[] ages,int max){
		for(int i=0;i<ages.length;i++){
			if(max<ages[i]){
				max=ages[i];
			}
		}
		return max;
	}
	public void Avg(int x,int y){
        double sum=x+y;
        System.out.println("平均分："+(sum/2));
    }
	
}
