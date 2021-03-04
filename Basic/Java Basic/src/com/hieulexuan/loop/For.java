package com.hieulexuan.loop;

public class For {

	public static void main(String[] args) {
		for (int i = 0; i< 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----");
		
		int x = 0;
		for (; x < 5;) {
			System.out.println(x);
			x += 3;
		}
	}
	
}
