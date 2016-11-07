package com.fk.javacore.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out=System.out;
//扫描读取文档		
	/*	File file=new File("F:"+File.separator+"Temp"+File.separator+"Test"+File.separator+"Test.txt");
		InputStream intput=new FileInputStream(file);
		Scanner scan = new Scanner(intput);
		while(scan.hasNextLine()){
			out.println(scan.nextLine());
		}
		scan.close();*/
		
//重复输入，知道输入符合规则的值
		Scanner scan1=new Scanner(System.in);
		int x=0;
		out.println("请输入一个数 ： ");		
		out.println("请输入一个数 ： ");		
		out.println("请输入一个数 ： ");				
		while (!scan1.hasNextInt()) {
			out.println("你输入有误，请重新输入： ");	
			//scan1.next();
			/*out.println("你输入有误，请重新输入： "+scan1.hasNextInt());
			String b=scan1.nextLine();
			out.println(b);
			out.println("scan1 "+scan1);
			out.println("scan1 "+scan1.next());*/
			
		}
		x=scan1.nextInt();
		out.println("输入的数是 ： "+x);
		scan1.close();
		
		
//		
	}

}
