package com.hieulexuan.domain;

public class Main {

	public static void main(String[] args) {
		Employees emp = new Employees();
		
		Person p = new Employees();
		
		emp.setName("A");
		emp.setSalary(12000000);
		
		p.setName("B");
//		p.setSalary(12000000); // person class do not function setSalary;
		
		emp.infomation();
		p.infomation();
		
		///////////////////////
		
		Workers w = new Workers();
		Employees e = new Workers();
		Person p1 = new Workers();
		Object o = new Workers();
		
		w.salary();
		Workers k1 = (Workers)e;
		k1.salary();
		((Workers) p1).salary();
		
		///////////////////////
		
		Person person1 = new Person();
		
		if (person1 instanceof Workers) {
			((Workers)person1).salary();
		} else {
			System.out.println("do not worker!");
		}
		
		Person person2 = new Workers();
		
		if (person2 instanceof Workers) {
			System.out.println("Worker.");
		}
		if (person2 instanceof Employees) {
			System.out.println("Employee");
		}
	}
}
