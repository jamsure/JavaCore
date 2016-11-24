package com.fk.javacore.ood;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Human implements Serializable,Comparable<Human>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Integer age;
	private String work;
		
	public Human() {
		super();
		System.out.println("执行了Human的构造方法！");
	}
	
	public Human(String id, String name, Integer age, String work) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Human [id=" + id + ", age=" + age + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((work == null) ? 0 : work.hashCode());
		return result;
	}

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
		if (!(obj instanceof Human)) {
			return false;
		}
		Human other = (Human) obj;
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
	public int compareTo(Human o) {
		if(this.getAge().intValue()==o.getAge().intValue()){
			return 0;
		}else if (this.getAge().intValue()>o.getAge().intValue()) {
			return 1;
		}else {
			return -1;
		}
	}

	public Human(String id, Integer age) {
		super();
		this.id = id;
		this.age = age;
	}

	

	
	
	
}
