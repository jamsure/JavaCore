package com.fk.javacore.ood;



public class Outter {
	private Inner inner;
	private int id=12345;
	private String name="outter";
		
	public Inner getInnerInstence() {
		if (inner == null) {
			inner = new Inner();
		}
		return inner;
	}

	void print() {
		System.out.println("执行的的是outter的print方法！");
		System.out.println("我调用了内部的名字："+getInnerInstence().name);
	}

	void exe() {
		System.out.println("通过outter调用inner的exe方法！");
		getInnerInstence().print();
	}

	class Inner {
		String name = "Inner!";
		
		void changeId(){
			Outter.this.id=10000;
			System.out.println("outter的id改为："+Outter.this.id);
		}
		void print() {
			System.out.println("执行的的是inner的print方法！");
			System.out.println("我调用了外部的名字："+Outter.this.name);
		}

		void exe() {
			System.out.println("通过inner调用outter的exe方法！");
			Outter.this.print();
		}
	}

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Inner inner = outter.new Inner();

		outter.print();
		System.out.println();
		outter.exe();
		System.out.println();
		inner.print();
		System.out.println();
		inner.exe();
		System.out.println();
		inner.changeId();
	}

}
