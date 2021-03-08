package com.hieulexuan.domain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employees[] emps = new Employees[3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter of 3 employees:");
		
		for(int i = 0; i < emps.length; i++) {
			String nameStress = scanner.nextLine();
			String name = scanner.nextLine();
			int experYears = scanner.nextInt();
			
			Address address = new Address(nameStress);
			
			Employees emp = new Employees(name, experYears);// bien tham chieu tro toi bo nho head.
			emp.setAddress(address);
			
			emps[i] = emp;
			
			scanner.nextLine();
		}
		
		System.out.println("Infimation of employees input");
		for (Employees employees : emps) {
			System.out.println("name: " + employees.getName() + 
					" address: " + employees.getAddress().getNameStress() + 
					" salary: " +employees.salary());
		}
	}
}
