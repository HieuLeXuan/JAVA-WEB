package com.hieulexuan.practices;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter value in to the arr:");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Array input in is:");
		for (int x : arr) {
			System.out.println(x);
		}
		
		//
		
		System.out.println("PLease input value you want to find:");
		int k = scanner.nextInt();
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (k == arr[i]) {
				System.out.println("Find value in index " + i);
			}
		}
		
		//
		
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (temp > arr[i]) {
					arr[i] = arr[j];
					arr[j] = temp;
					temp = arr[j];
				}
			}
		}
		
		System.out.println("Array is sort");
		for (int x : arr) {
			System.out.println(x);
		}
		
	}

}
