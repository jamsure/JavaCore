package com.ddb.JavaCore.datetype;
import java.io.PrintStream;
public class BinaryString {

	public static void main(String[] args) {
		PrintStream prt=System.out;
		int a=19;
		int b=5;
		prt.println("a 的二进制："+Integer.toBinaryString(a));
		prt.println("b 的二进制："+Integer.toBinaryString(b));
		prt.println("a & b = "+ ( a & b));
		prt.println("a & b 的二进制："+ Integer.toBinaryString(( a & b)));
		prt.println("a | b = "+ ( a | b));
		prt.println("a | b 的二进制："+ Integer.toBinaryString(( a | b)));
		prt.println("a ^ b = "+ ( a ^ b));
		prt.println("a ^ b 的二进制："+ Integer.toBinaryString(( a ^ b)));
		prt.println("a <<31  "+ ( a << 31));
		prt.println("a <<31 的二进制："+ Integer.toBinaryString(( a << 31)));
		prt.println("a <<30  "+ ( a << 30));
		prt.println("a <<30 的二进制："+ Integer.toBinaryString(( a << 30)));
		prt.println("a <<29  "+ ( a << 29));
		prt.println("a <<29 的二进制："+ Integer.toBinaryString(( a << 29)));
		prt.println("a >>2  "+ ( a >> 2));
		prt.println("a >>2 的二进制："+ Integer.toBinaryString(( a >> 2)));
		prt.println("a >>>2  "+ ( a >>> 2));
		prt.println("a >>>7 的二进制："+ Integer.toBinaryString(( a >>> 7)));
		}
	}


