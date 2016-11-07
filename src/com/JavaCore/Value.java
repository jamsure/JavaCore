package com.JavaCore;

import java.util.Arrays;



class Customer{
	String name;
	int age;
	Customer(String name) {
		this.name=name;
		
	}
}
public class Value {
	
public int x;
public Value (int x){
	x=x;
}
		static void some(Customer c){
			c.name="Jhon";
		}
		
		static void other(Customer c){
			c = new Customer("Bill");
		}
	public static void main(String[] args) {
		Customer c1=new Customer("Justin");
		some(c1);
		System.out.println(c1.name);
		
		Customer c2=new Customer("Justin");
		other(c2);
		System.out.println(c2.name);
		int[] aa={1,2,3};
		int[] bb=Arrays.copyOf(aa, aa.length);
		for (int i : bb) {
			System.out.println(i);
		}
		
		Value value=new Value(10);
		System.out.println(value.x);
		
	}

}
