package com.hieulexuan.dto;

public class Person {

	private String name;
	private Address address;// has-a; moi person has a dia chi

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

}
