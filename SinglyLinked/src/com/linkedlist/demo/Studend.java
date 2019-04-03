package com.linkedlist.demo;

/**
 * @author Shubham
 *
 */
public class Studend {
	 
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((panNumber == null) ? 0 : panNumber.hashCode());
		result = prime * result + ((schoolName == null) ? 0 : schoolName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studend other = (Studend) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
	
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Studend [name=" + name + ", address=" + address + ", schoolName=" + schoolName + ", id=" + id
				+ ", panNumber=" + panNumber + "]";
	}
	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNumber() {
		return panNumber;
	}
	/**
	 * @param panNumber
	 */
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	private String name;
	
	/**
	 * @param name
	 * @param address
	 * @param schoolName
	 * @param id
	 * @param panNumber
	 */
	public Studend(String name, String address, String schoolName, int id, String panNumber) {
		this.name = name;
		this.address = address;
		this.schoolName = schoolName;
		this.id = id;
		this.panNumber = panNumber;
	}
	private String address;
	private String schoolName;
	private int id;
	private String panNumber;
	

}
