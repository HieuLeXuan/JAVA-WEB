package com.hieulexuan.dto;

public class Main {

	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.setName("A");
		emp.setAddress(null);
		
		Address address = new Address();
		address.setNameStress("Ha Noi");
		
		emp.setAddress(address);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getNameStress());
	}
	
}
