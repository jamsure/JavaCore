package com.fk.javacore.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] aa={1,2,3,6,4};
		int[] bb=new int[aa.length];
		System.arraycopy(aa, 0, bb, 0, aa.length);
		System.out.println();
		for (int i : aa) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : bb) {
			System.out.print(i+" ");
		}
		bb[0]=555;
		System.out.println();
		for (int i : aa) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : bb) {
			System.out.print(i+" ");
		}
		
	}

}
