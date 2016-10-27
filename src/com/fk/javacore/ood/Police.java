package com.fk.javacore.ood;

public class Police extends Human {
	 String country;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
		}
	
	
	public Police() {
		super();
	}

	public Police(String id, String name, Integer age, String work,String country) {
		super(id,name,age, work);
		this.country = country;
	}
	
	public void cook(){
		System.out.println("Police厨师！国家"+this.country);
		
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Police)) {
			return false;
		}
		Police other = (Police) obj;
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"Police [country=" + country + "]";
	}

	public static void main(String[] args) {
		Police police=new Police();
		System.out.println(police);
		Police police1=new Police("ID-111-0","jingcha",24,"Police","China");
		System.out.println(police1);
		police.getAge();
	
		
	}

}
