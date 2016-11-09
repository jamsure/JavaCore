package com.fk.javacore.tekv;

import java.util.ArrayList;

public class BoundedWildcard {

	public static void main(String[] args) { 
		
	}

}
class TwoD{
	int x,y;
	TwoD(int a,int b){
		x=a;
		y=b;
	}
}
class ThreeD extends TwoD{
	int z;
	ThreeD(int a,int b,int c){
		super(a,b);
		z=c;
	}
}
class FourD extends ThreeD{
	int t;
	FourD(int a,int b,int c,int d){
		super(a, b, c);
		t=d;
	}
}

class Coords<T extends TwoD>{
	T[] coords;
	public Coords(T[] o) {
		coords=o;
	}
}

	class BoundWildcard{
		static void showXY(Coords<?> c){
			System.out.println("X Y Coordinates:");
			for(int i=0;i<c.coords.length;i++){
				System.out.println(c.coords[i].x+" ");
			}
		}
	}

