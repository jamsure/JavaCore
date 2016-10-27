package com.ddb.JavaCore.datetype;
import java.io.PrintStream;


public class DateType {

	public static void main(String[] args) {
		PrintStream prt=System.out;
		//int
		prt.println("int 类型： ");
		prt.println("Integer.BYTES: "+Integer.BYTES+";");
		prt.println("Integer.MIN_VALUE: "+Integer.MIN_VALUE+";");
		prt.println("Integer.MAX_VALUE: "+Integer.MAX_VALUE+";");
		prt.println("Integer.SIZE: "+Integer.SIZE+";");
		prt.println("Integer.class: "+Integer.class+";");
		
		//Byte
		prt.println();
		prt.println("Byte 类型： ");
		prt.println("Byte.BYTES: "+Byte.BYTES+";");
		prt.println("Byte.MIN_VALUE: "+Byte.MIN_VALUE+";");
		prt.println("Byte.MAX_VALUE: "+Byte.MAX_VALUE+";");
		prt.println("Byte.SIZE: "+Byte.SIZE+";");
		prt.println("Byte.class: "+Byte.class+";");
		Byte ab=127;
		ab=(byte) (ab+1);
		prt.println("Byte.MAX_VALUE + 1 = "+ab);
		
		//double
		prt.println();
		prt.println("Double 类型： ");
		prt.println("Double.MAX_EXPONENT: "+Double.MAX_EXPONENT+";");
		prt.println("Double.MAX_VALUE: "+Double.MAX_VALUE+";");
		prt.println("Double.SIZE: "+Double.SIZE+";");
		
		//char
		prt.println();
		prt.println("char 类型： ");
		prt.println("Character.MIN_RADIX: "+Character.MIN_RADIX+";");
		prt.println("Character.MAX_RADIX: "+Character.MAX_RADIX+";");
		prt.println("Character.MAX_CODE_POINT: "+Character.MAX_CODE_POINT+";");
		
	}

}
