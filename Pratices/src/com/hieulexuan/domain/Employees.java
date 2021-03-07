package com.hieulexuan.domain;

public class Employees extends Person {

	private double salary;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
