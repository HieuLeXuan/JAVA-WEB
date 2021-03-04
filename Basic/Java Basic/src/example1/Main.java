package example1;

public class Main {

	public static void main(String[] args) {
		
		float chieuDai = 4.5f;
		float chieuRong = 3.4f;
		
		float chuViRectangle = Rectangle.chuVi(chieuDai, chieuRong);
		float dienTichRectangle = Rectangle.dienTich(chieuDai, chieuRong);
		
		System.out.println("Chu vi va Dien tich Rectangle");
		System.out.println(chuViRectangle);
		System.out.println(dienTichRectangle);
		
	}
	
}
