package com.fk.javacore.weektest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FullSquare {

	public static void main(String[] args) throws IOException {
		PrintStream out=System.out;
		//String string;
		File file=new File("F:"+File.separator+"Test"+File.separator+"config.txt");
		if(!file.exists()){
			if(file.isDirectory()){
				file.mkdirs();
			}else {
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
		}
		FileOutputStream config=new FileOutputStream(file);
		Writer writer=new OutputStreamWriter(config,"utf-8");
		writer.write("这是一个java上机题的文档文件：\r\n");
		writer.write("一个正整数，它加上100后是一个完全平方数，再加上168有是一个完全平方数，请问该数是多少？\r\n");
		writer.write("需要的参数如下：通过程序读取本文件，解析下面的字符串得到需要的参数值\r\n");
		writer.write("100#168#1000\r\n");
		writer.write("题目的要求是：在此文档中使用程序写入解题思路，同时在源码中，尽可能多写注释让人一眼看懂代码逻辑\r\n");
		writer.write("将计算的结果，最后再写回这个配置文件的尾部，有多个结果时换行输出，以方便阅读。");
		writer.close();
		
		String keyString;
		List<Integer> numList=new ArrayList<Integer>();
		InputStream iStream=new FileInputStream(file);
		Scanner scanner=new Scanner(iStream,"utf-8");
		while (scanner.hasNextLine()) {
			keyString=scanner.nextLine();
			out.println("读取当前行内容为 ： "+keyString);
			if (keyString.indexOf("#")!=-1) {
				extractNumber(keyString, numList);
				out.print("当前行中，有需要的参数，参数为     ");
				for (Integer integer : numList) {
					out.print(integer+"  ");
				}
				out.println("\r\n不再读取当前文件，读取配置文件的方法退出！");
				break;
			}
		}
		int keys=numList.size();
		squareNumbers(numList);
		out.println("结果为 ： ");
		if(keys==numList.size()){
			out.println("+++++对不起没有这个数！+++++");
		}else {
			for (int i=keys; i < numList.size(); i++) {
			out.println(numList.get(i));
		}
		}
		scanner.close();
		
		
		
		
		
		
	}

	private static void extractNumber(String string1, List<Integer> numList) {
		int i,j;
		String str1=string1;
		while((i=str1.indexOf("#"))!=-1){
			j=str1.indexOf("#",i+1);
			if (i!=0) {
				numList.add(Integer.parseInt(str1.substring(0, i)));
				str1=str1.substring(i);
			}else if (j>=(i+1)) {
				if(j==i+1){
					str1=str1.substring(j);
				}else{
					numList.add(Integer.parseInt(str1.substring(1, j)));
					str1=str1.substring(j);
				}
			}else if (i==str1.length()-1) {
				break;
			}else if(j==-1){
				numList.add(Integer.parseInt(str1.substring(i+1)));
				str1=str1.substring(i+1);
			}
		}
	}
	
	private static void squareNumbers(List<Integer> numList) {
		PrintStream out=System.out;
		out.println("通过读取配置文件得到参数为 ："+numList.get(0)+"\t"+numList.get(1)+"\t"+numList.get(2));
		int a,b;
		double x,y;
		for(int i=0;i<=numList.get(2);i++){
			a=(int)Math.sqrt(i+numList.get(0));
			x=Math.sqrt(i+numList.get(0));
			b=(int)Math.sqrt(i+numList.get(1));
			y=Math.sqrt(i+numList.get(1));
			if((x-a==0)&&(y-b==0)){
				numList.add(i);
			}
		}
		
	}

}

