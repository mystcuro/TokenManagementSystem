package com.tm.web;

public class Customer {
	private int id;
	private String cName;
	
	public Customer(int id, String cName) {
		this.id = id;
		this.cName = cName;
	}

	public Customer(String cName) {
		this.cName = cName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cName=" + cName + "]";
	}
	
	
	
	
	
	
	
}
