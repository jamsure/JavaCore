package com.fk.javacore.ood;

public class Test1 {

	public static void main(String[] args) {
		/*Human human=new Human();
		Human human1=new Police();
		Human human2=new Student();
		Human human3;
		Police police1=new Police();
				
		System.out.println(human);	
		Police police=(Police)human1;
		System.out.println(police);
		human3=(Human)police1;
		System.out.println(human3);*/
		
	/*	Police police=new Police(null, null, 25, null, null);
		System.out.println(police);
		*/
		
		/*Human human1=new Human("12345","zhangsan",25,"worker");
		Human human2=new Human("12345","zhangsan",25,"worker");
		if (human1.equals(human2)) {
			System.out.println("human1与human2相等");
		}else{
			System.out.println("human1与human2不相等");
		}*/
		
		
		Police police1=new Police("12345","zhangsan",25,"worker","China");
		Human human=police1;
		if (police1==human) {
			System.out.println("human与police1相等");
		}else{
			System.out.println("human与police1不相等");
		}
		Police police2=(Police)human;
		if (human.equals(police2)) {
			System.out.println("human与police2相等");
		}else{
			System.out.println("human与police2不相等");
		}
		if (police2.equals(human)) {
			System.out.println("human与police2相等");
		}else{
			System.out.println("human与police2不相等");
		}
		human.setAge(90);
		System.out.println(police1.hashCode());
		System.out.println(human.hashCode());
		System.out.println(police2.hashCode());
		
		/*Police police=(Police)human;
		System.out.println(police);
		police.cook();
		*/
	}

}
