package com.hieulexuan.domain;

public class Person {

	private final double ORIGANAL_SALARY = 2000000; 
	private String name;
	private Address address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double salary() {
		return ORIGANAL_SALARY;
	}

}
