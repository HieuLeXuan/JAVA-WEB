package com.hieulexuan.domain;

public class SubClass extends SuperClass {

	@Override
	public float Sum2Num(float a, float b) {
		return 10 + 20;
	}
	
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.Sum2Num(20, 10);
	}
	
}
