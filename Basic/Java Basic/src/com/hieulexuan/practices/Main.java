package com.hieulexuan.practices;

import java.util.Scanner;

import com.hieulexuan.object.Employees;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int [5];
		
		Employees[] employees = new Employees[3];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your value: ");
		
		for (int i = 0; i < employees.length; i++) {
			String name = scanner.nextLine();
			int age = scanner.nextInt();
			String address = scanner.nextLine();
			
			employees[i] = new Employees(name, address, age);
			
			// delete data
			scanner.nextLine();
		}
		
		for (Employees nv : employees) {
			System.out.println(nv.getName() + " " + nv.getAge() + " " + nv.getAddress());
		}
	}

}
