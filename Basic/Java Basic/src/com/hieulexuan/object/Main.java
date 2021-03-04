package com.hieulexuan.object;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Hieu");
		person1.setAge(25);
		
		Person person2 = new Person();
		person2.setName("Peter");
		person2.setAge(24);
		
		System.out.println(person1.getName() + " " + person1.getAge());
		System.out.println(person2.getName() + " " + person2.getAge());
		
		//
		
		Book book1 = new Book();
		book1.setNameBook("A");
		book1.setDescript("A");
		book1.setPrice(12.05);
	}
	
}
