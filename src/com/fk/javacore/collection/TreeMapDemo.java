package com.fk.javacore.collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.fk.javacore.ood.Human;

public class TreeMapDemo {

	public static void main(String[] args) {
		PrintStream out=System.out;
		TreeMap<Long, Human> huTreeMap=new TreeMap<Long, Human>();
		huTreeMap.put(2L, new Human("ID--002",25));
		huTreeMap.put(4L, new Human("ID--003",5));
		huTreeMap.put(5L, new Human("ID--004",15));
		huTreeMap.put(6L, new Human("ID--005",35));
		huTreeMap.put(7L, new Human("ID--006",20));
		out.println("huTreeMap : "+huTreeMap);
		
		out.println("huTreeMap.entrySet() : ");
		Set<Map.Entry<Long, Human>> treeEntry=huTreeMap.entrySet();
		/*for (Entry<Long, Human> entry : treeEntry) {
			out.println(entry);
		}*/
		for (Entry<Long, Human> entry : huTreeMap.entrySet()) {
			out.println(entry);
		}
		
		out.println("huTreeMap.values() : "+huTreeMap.values());
		out.println("huTreeMap.comparator() : "+huTreeMap.comparator());
				
	}

}
