package com.hieulexuan.domain;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setFullName("A", "B");
		p.getFullName();
		
		System.out.println(p.getFullName());
	}
}
