package com.fk.javacore.ood;

public class Teacher extends Human {
	private String id;
	private String name;
	private Integer age;
	private String work;
	final static int jk=0;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	
	/**
	 * @return the jk
	 */
	public static int getJk() {
		return jk;
	}

	public Teacher(String id, String name, Integer age, String work) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}*/

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((work == null) ? 0 : work.hashCode());
		return result;
	}*/

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Teacher)) {
			return false;
		}
		Teacher other = (Teacher) obj;
		if (age == null) {
			if (other.age != null) {
				return false;
			}
		} else if (!age.equals(other.age)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (work == null) {
			if (other.work != null) {
				return false;
			}
		} else if (!work.equals(other.work)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", "
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		Teacher teacher1=new Teacher("ID-12345", "xiaofei", 26, "teacher");
		Teacher teacher2=new Teacher("ID-12345", "xiaofei", 26, "teacher");
		Teacher teacher3=new Teacher("ID-12345", "dafei", 26, "teacher");
		Teacher teacher4=teacher3;
		
		System.out.println("teacher1 :"+teacher1);
		System.out.println("teacher2 :"+teacher2);
		if (teacher1==teacher2) {
			System.out.println("teacher1==teacher2 :"+(teacher1==teacher2));
		}else{
			System.out.println("teacher1!=teacher2 :"+!(teacher1==teacher2));
			
		}
		if (teacher1.equals(teacher2)) {
			System.out.println("teacher1.equals(teacher2) :"+teacher1.equals(teacher2));
		}	else{
			System.out.println(" !teacher1.equals(teacher2) :"+!teacher1.equals(teacher2));
			
		}
		System.out.println();
		System.out.println("teacher1 :"+teacher1);
		System.out.println("teacher3 :"+teacher3);
		if (teacher1.equals(teacher3)) {
			System.out.println("teacher1.equals(teacher3) :"+teacher1.equals(teacher3));
		}	else{
			System.out.println(" !teacher1.equals(teacher3) :"+!teacher1.equals(teacher3));
			
		}
		System.out.println();
		System.out.println("teacher3 :"+teacher3);
		System.out.println("teacher4 :"+teacher4);
		if (teacher3.equals(teacher4)) {
			System.out.println("teacher3.equals(teacher4) :"+teacher3.equals(teacher4));
		}	else{
			System.out.println(" !teacher3.equals(teacher4) :"+!teacher3.equals(teacher4));
			
		}
		System.out.println();
		teacher4.setId("ID-0001");
		System.out.println("teacher3 :"+teacher3);
		System.out.println("teacher4 :"+teacher4);
		
	}

	
}
