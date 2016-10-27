package com.ddb.JavaCore.datetype;

import java.io.PrintStream;

public class DateTypeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream prt = System.out;
		//int demo
		int a, b;
		a = 4;
		b = 7;
		
		prt.println("int demo: ");
		prt.println("a  = " + a + ";");
		prt.println("b = " +  b + ";");
		prt.println("a + b = " + (a + b) + ";");
		prt.println("a - b = " + (a - b) + ";");
		prt.println("a * b = " + (a * b) + ";");
		prt.println("a / b = " + (a / b) + ";");
		prt.println("a % b = " + (a % b) + ";");
		
		//float demo
		prt.println();
		float m,n=(float) 7.0;
		m=9;
		prt.println("float demo: ");
		prt.println("m  = " + m + ";");
		prt.println("n = " +  n + ";");
		prt.println("m + n = " + (m + n) + ";");
		prt.println("m - n = " + (m - n) + ";");
		prt.println("m * n = " + (m * n) + ";");
		prt.println("m / n = " + (m / n) + ";");
		prt.println("m % n = " + (m % n) + ";");
		
		//char demo
		prt.println();
		char j='f',k;
		k='k';
		prt.println("char demo: ");
		prt.println("j  = " + j + ";");
		prt.println("k = " +  k + ";");
		prt.println("j + k = " + (j + k) + ";");
		prt.println("j + k = "+String.valueOf(j)+String.valueOf(k));
		
		//String demo
		prt.println();
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );
	      
	      prt.println();
	      String x,y;
	      x="I love ";
	      y="Hello World!";
	      prt.println("String demo:");
	      prt.println("x = "+x);
	      prt.println("y = "+y);
	      prt.println("x + y = "+x+y);
		
	}

}
