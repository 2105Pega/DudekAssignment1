package com.revature.beans;

public class Employee {

	private String name;
	private String somethingElse;
	
	
	
	public Employee(String name, String somethingElse) {
		this.name = name;
		this.somethingElse = somethingElse;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSomethingElse() {
		return somethingElse;
	}

	public void setSomethingElse(String somethingElse) {
		this.somethingElse = somethingElse;
	}

	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", somethingElse=" + somethingElse +"]";
	}
	
	
	

//	public Employee(String name) {
//		super();
//		this.name = name;
//
//	}
	
	
	
}
