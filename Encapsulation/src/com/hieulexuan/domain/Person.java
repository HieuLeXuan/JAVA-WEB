package com.hieulexuan.domain;

public class Person {

	private String name;
	private String lastName;

	public void setFullName(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return this.lastName + " " + this.name;
	}
}
