package com.fk.javacore.enumtest;

import java.io.PrintStream;



public class EnumTest {
	public static void print(EnumDemo e){
		switch (e) {
		case MONDAY:
			outPrint(e);			
			break;
		case TUESDAY:
			outPrint(e);			
			break;
		case WEDNESDAY:
			outPrint(e);			
			break;
		case THURSDAY:
			outPrint(e);			
			break;
		case FRIDAY:
			outPrint(e);			
			break;
		case STAURDAY:
			outPrint(e);
			break;
		default:
			outPrint(e);			
			break;
		}
	}



	private static void outPrint(EnumDemo e) {
		System.out.println(e.getDes()+"  "+e.getState());
	}



	public static void main(String[] args) {
		EnumDemo eDemo=EnumDemo.STAURDAY;
		print(eDemo);
		print(EnumDemo.MONDAY);
		print(EnumDemo.TUESDAY);
		print(EnumDemo.THURSDAY);
		print(EnumDemo.WEDNESDAY);
		System.out.println(eDemo.getDeclaringClass());
		System.out.println(eDemo.getClass());
		System.out.println(eDemo.name());
		
	}

}
