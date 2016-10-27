package com.ddb.JavaCore.datetype;

import java.io.PrintStream;

public class Demo3 {
	public static void main(String[] args) {
		PrintStream prt = System.out;

		// byte
		Byte byte1 = 13;
		Byte byte2 = 17;

		// short
		Short short1 = 200;
		Short short2 = 300;

		// int
		Integer integer1 = 35;
		Integer integer2 = 54;

		integer2 = Integer.parseInt("" + byte2);
		prt.println(integer2);

		int i = 0;
		byte b = 11;
		i = (int) b;
		prt.println(i);
		
	}
}
