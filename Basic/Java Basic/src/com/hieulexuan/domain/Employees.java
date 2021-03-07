package com.hieulexuan.domain;

public class Employees extends Person {

	double salary;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, String address, double salary) {
		super(name, address);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
