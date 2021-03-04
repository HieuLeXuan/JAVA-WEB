package com.hieulexuan.object;

public class Rectangle {

	static int count = 0; //bien class
	
	public static int chuVi(int chieuDai, int chieuRong) {
		return (chieuDai + chieuRong) * 2;
	}

	public static void main(String[] args) {
		System.out.println(Rectangle.count);
		
		Rectangle.count ++;
		
		System.out.println(Rectangle.count);
		System.out.println(Rectangle.chuVi(5, 6));
		
		Rectangle hinh1 = new Rectangle();
		Rectangle hinh2 = new Rectangle();
		
		hinh1.count = 5;
		
		System.out.println(Rectangle.count);
		
		hinh2.count = 10;
		
		System.out.println(Rectangle.count); 
	}
	
}
