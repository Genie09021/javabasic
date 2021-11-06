package day11;

public class ClassEx33 {

	double d; 
	
	ClassEx33 () {
		System.out.println("기본 생성자");
		d= Math.random();
	}
	// 생성자 오버로딩
	ClassEx33 (double a) {
		System.out.println("생성자2");
		d= a;
	}
	
	public static void main(String[] args) {

		ClassEx33 c1 = new ClassEx33();
		System.out.println(c1.d);
		ClassEx33 c2 = new ClassEx33(5.12);
		System.out.println(c2.d);
		
	
		
	}

}
