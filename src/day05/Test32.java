package day05;

public class Test32 {

	public static void main(String[] args) {
		//반복문 사용시 주의점
		
		// int i는 for문 안에서 만들어 졌으니, for 안에서만 유효함.
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
		//System.out.println(i);
	
		int a = 0;
		for (a = 0; a<5; a++) {
			System.out.println(a);
		}
		System.out.println(a);
		
		//
		int b = 0;
		for(b=0; b<5; b++) {
			System.out.println(b);
		}
		System.out.println("b:" +b);
		System.out.println();
		
		//
		int c = 0;
		//초기식 생략가능
		for (; c<5; c++) {
			System.out.println(c);
		}
		System.out.println("c :"+ c);
		System.out.println();
		
		for (int d = 0; d <3; d++) {// d--는 무한 반복 약 -21억~ 21억-1 
			System.out.println("hola");
		}
		// 잘 안씀
		for(;;) {
			
		}
		
		
		
		
		
		
		
		
		
	} //main

} // class
