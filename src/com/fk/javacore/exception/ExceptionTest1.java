package com.fk.javacore.exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		int num=0;
		try {
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
//			int num3=Integer.parseInt(args[2]);			
			num = num1/num2;
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		 catch (ArithmeticException e) {
		e.printStackTrace();
		return;
		}finally {
			System.out.println("反正我是会执行的！！！！");
			
		}
		System.out.println();
		System.out.println("num = "+num);
}
}
