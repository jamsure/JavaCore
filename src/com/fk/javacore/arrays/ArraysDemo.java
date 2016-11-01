package com.fk.javacore.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int x=15;
		int a = (x + 1) / 2;
		for(int i=1;i<=a;i++){
			if(i==1){
				for(int n=1;i<=x;n++){
				System.out.print("*");
				}
				 System.out.println();
				}else{
			for(int j=1;j<=(x-i+1);j++){
				if(j==i||j==(x-i)){
					System.out.print("*");
				}else {	
					System.out.print(" ");
				}
			}
			
		}}
	}

}
