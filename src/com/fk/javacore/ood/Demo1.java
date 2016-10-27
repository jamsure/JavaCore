package com.fk.javacore.ood;

public class Demo1 {

	public static void main(String[] args) {
		Student student=new Student();
		student.setAge(-15);
		student.setSex('男');
		student.student();
		Student student1=new Student("fankai",-26);
		student1.student();
		System.out.println(student1);
	}
}
