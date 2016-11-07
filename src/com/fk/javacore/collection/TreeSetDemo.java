package com.fk.javacore.collection;

import java.io.PrintStream;
import java.util.TreeSet;

import com.fk.javacore.ood.Human;

public class TreeSetDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		TreeSet<Human> huTree=new TreeSet<Human>();
		huTree.add(new Human("ID--001",20));
		huTree.add(new Human("ID--002",30));
		huTree.add(new Human("ID--003",50));
		huTree.add(new Human("ID--004",40));
		huTree.add(new Human("ID--005",10));
		huTree.add(new Human("ID--006",29));
		
		out.println("huTree : "+ huTree);
		Human human30=new Human("ID--007",30);
		
		out.println("huTree.ceiling(human30)"+huTree.ceiling(human30));
	}

}
