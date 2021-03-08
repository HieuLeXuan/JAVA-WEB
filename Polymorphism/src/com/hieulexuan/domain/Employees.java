package com.hieulexuan.domain;

public class Employees extends Person{

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void infomation() {
		System.out.println("child class");
	}

}
