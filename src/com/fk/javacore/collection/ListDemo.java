package com.fk.javacore.collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		List<String> strList = new ArrayList<String>();
		strList.add("This ");
		strList.add("an ");
		strList.add("apple ");
		strList.add("!");

		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(3);
		intlist.add(5);
		intlist.add(6);
		intlist.add(4);
		intlist.add(3);
		out.println("删除前：" + intlist);
		intlist.remove((Integer) 3);
		out.println("删除后：" + intlist);

		Set<Integer> intset = new HashSet<Integer>();
		intset.add(11);
		intset.add(13);
		intset.add(14);
		intset.add(15);
		intset.add(16);
		intset.add(178);
		
		
		out.println("打印intset："+intset);
		out.print("迭代器打印intlist：");
		Iterator iterator = intlist.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			out.print(object + " ");
		}
		out.println();
		for (int i = 1; i < 10; i++) {
			intset.add(2*i+3);
		}
		out.print("迭代器打印intset： ");		
		Iterator iterator2=intset.iterator();
		while (iterator2.hasNext()) {
			Object object = (Object) iterator2.next();
			out.print(object + " ");
		}
		
		/*Set<Integer> random=new HashSet<Integer>();
		while (random.size()<10) {
			random.add((int)(Math.random()*10)+1);
		}
		out.println();
		out.print("打印50以内不重复的随机数："+random);
		
		List<Integer> random1=new ArrayList<Integer>();
		while (random1.size()<10) {
			random1.add((int)(Math.random()*10)+1);
		}
		out.println();
		out.print("打印50以内不重复的随机数："+random1);*/
	}

}
