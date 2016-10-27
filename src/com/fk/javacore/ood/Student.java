package com.fk.javacore.ood;

public class Student extends Human{
		private String name;
		private int age;
		private char sex;
		private int id;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		

		public void setAge(int age) {
			if(age>=0){
			this.age = age;}
			else{
				System.out.println("输入的年龄有误！");
			}
		}

		public char getSex() {
			return sex;
		}

		public void setSex(char sex) {
			this.sex = sex;
		}

		

		public void setId(int id) {
			this.id = id;
		}

	Student() {
			System.out.println("只是创建了一个对象。");
		}
		
		public Student(String name, int age) {
			System.out.println("给了名字和年龄");
			this.name = name;
			if(age>=0){
				this.age = age;}
				else{
					System.out.println("输入的年龄有误！");
				}
		}

		void student(){
			System.out.println("姓名:"+name+" 年龄:"+age+" 性别："+sex);
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", id=" + id + ", getName()=" + getName()
					+ ", getClass()=" + getClass() + "]";
		}
		
	}



