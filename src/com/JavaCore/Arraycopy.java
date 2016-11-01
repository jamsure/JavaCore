package com.JavaCore;

import java.util.Arrays;
import java.util.Scanner;

public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa=new Scanner(System.in);
		int x=sa.nextInt();
		System.out.println(x);
		int[] a={1,3,4,9,8};
		int[] b = new int[5];
		int[] c;
		System.arraycopy(a, 0, b, 0, 3);
		for (int i : b) {
			System.out.print(i);
		}
		c=Arrays.copyOf(a, 5);
		for (int i : c) {
			System.out.print(i);
		}
		
	}

}
