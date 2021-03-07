package com.hieulexuan.domain;

public class Employees1 extends Person1{

	String ten;
	
	public void infomation() {
		this.name = "B";
		System.out.println("Infomation of child class is: " + name);
		
		super.infomation();
		super.name = "B";
		this.name = "C";
	}
	
}
