package com.hieulexuan.domain;

public class Employees extends Person {

	private int experYears;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, int experYears) {
		super(name);
		this.experYears = experYears;
	}

	public int getExperYears() {
		return experYears;
	}

	public void setExperYears(int experYears) {
		this.experYears = experYears;
	}
	
	@Override
	public double salary() {
		if (this.experYears < 1) {
			return super.salary() * 1.5;
		} else if (this.experYears >= 1 && this.experYears < 3) {
			return super.salary() * 2;
		} else {
			return super.salary() * 3;
		}
	}

}
