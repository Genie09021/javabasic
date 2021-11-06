package day03;

public class Test14 {

	public static void main(String[] args) {
		// 이것이 자바다 확인문제
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); // x는 증가하고 11 출력, y는 20출력하고 감소 = 31

		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result);		
		
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수 
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수 
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println(value-56);
		System.out.println(value / 100 * 100);
		
		
		int lengthTop = 5;
		int lengthBottom =  10;
		int height = 7;
		double area = (((lengthTop + lengthBottom)*height)/2.0 );
		System.out.println(area);
		
		int a = 10;
		int b = 5;
		
		System.out.println((a>7) && (b<=5));  // True
		System.out.println(a%3 == 2); //false 
		System.out.println(b%2 != 1); //false
		// System.out.println((a%3 == 2) || (b%2 != 1)); //  false
						
		
	}

}
