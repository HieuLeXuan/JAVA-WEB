package com.hieulexuan.domain;

public class SuperClass {

	public int Sum2Num(int a, int b) {
		return a + b;
	}
	
	//overload method, ten giong nhau nhung doi so khac nhau
	public long Sum2Num(int a, long b) {
		return a + b;
	}
	
	public float Sum2Num(float a, float b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		
		sup.Sum2Num(10, 20);
	}
	
}
