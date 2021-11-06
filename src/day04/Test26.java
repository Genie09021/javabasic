package day04;

import java.util.Scanner;

public class Test26 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문제1. 정수를 입력받아 3~5응 "봄", 6~8은 "여름". 9~11은 "가을", 12~2는 "겨울" 출력.
		
		/*
		System.out.println("정수를 입력하세요>>");
		int num = Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 3: 
		case 4:
		case 5:	
			System.out.println("봄");
			break;			
		case 6: 
		case 7:
		case 8:	
			System.out.println("여름");
			break;
		case 9: 
		case 10:
		case 11:	
			System.out.println("가을");
			break;				
		case 12:   
		case 1:
		case 2:	
			System.out.println("겨울");
			break;				
		}
		*/
	
		
		// 문제 2. 성적을 입력받고, 90~100 "수". 80~89 "우", 70~79 "미" 60~69 "양" 그 이하는 "가"
		
		System.out.println("성적을 입력하세요>>");
		int score = Integer.parseInt(sc.nextLine());
		score /= 10;
		
		switch (score) {
		case 10:		
			System.out.println("수");
			break;
		case 9:		
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:	 
			System.out.println("미");
			break;
		case 6:	 
			System.out.println("양");
			break;
		default: 
			System.out.println("가");
			break;	
		}
		
		//문제3. 덧셈 +, 뺄셈 -, 곱셈 *, 나눗셈 / 중 원하는 기호를 선택하여 기호에 맞는 a,b의 연산결과를 출력하세요.
		int a =10;
		int b = 3;
		
		// switch => if => 삼항연산자
		
		
		sc.close();		
		
	}//main

} //class
