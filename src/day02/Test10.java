package day02;

// #1. Scanner 클래스를 사용할거야~!
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		//#2. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//#3. 입력받기 : String 변수명 = sc.nextLine()
		System.out.println("hello");
		String input = sc.nextLine();
		System.out.println(input);
		
		
		//#4. Scanner 닫기
		sc.close();
		System.out.println("프로그램 종료");
		
		
	}//main

}//class
