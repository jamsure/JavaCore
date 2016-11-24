package com.fk.javacore.collection;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		PrintStream out=System.out;
		Map<Long, Integer> hasMap=new HashMap<Long,Integer>();
		hasMap.put(10L, 10);
		hasMap.put(12L, 20);
		hasMap.put(14L, 30);
		hasMap.put(15L, 40);
		hasMap.put(16L, 50);
		hasMap.put(9L, 55);
		
		out.println("hasMap : "+hasMap);
		out.println();
		out.println("hasMap.entrySet() 遍历：");
		Set<Map.Entry<Long, Integer>> hasSetMap=hasMap.entrySet();
		for (Entry<Long, Integer> entry : hasSetMap) {
			out.println(entry);
		}
		out.println();
		Iterator iterator=hasSetMap.iterator();
		while (iterator.hasNext()) {
			Object object=iterator.next();
			out.println(object);
		}
		
		
		out.println("hasMap.put() 返回旧值或者null："+hasMap.put(9L, 940));
		
		
		
		
		
	}

}
