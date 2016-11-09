package com.fk.javacore.tekv;

public class Ttest {

	public static void main(String[] args) {
		Number[] number={1,2L,3F,4.4};
		Stats<Number> stats=new Stats(number);
		System.out.println(stats.nums[3]);
	}

}


class Stats<T extends Number>{
	T[] nums;
	public Stats(T[] o) {
	nums=o;
	}
	public static void print(){
		
	}
	
	
	
}
