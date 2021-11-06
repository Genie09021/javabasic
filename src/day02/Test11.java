package day02;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력받기
		System.out.println("이름을 입력해주세여>>"); // 콘솔에 뭐를 입력해야하는지 메세지 띄우기
		String name = sc.nextLine(); // 입력받아서 name변수에 문자열 저장
		System.out.println(name); // 입력 + 저장이 잘 됐는지 name변수 출력해서 확인
		
		System.out.println("나이를 입력해주세요>>");
		String age = sc.nextLine();
		// String = String
		//int ageInt = (int)age;   // String은 기본형(int등)으러 바로 형변환이 안된다.
		int ageInt = Integer.parseInt(age); //String -> int
		double ageDb = Double.parseDouble(age); //String -> double
		
		System.out.println(age);
		System.out.println("내년 당신의 나이는" + (ageInt +1) + "살 입니다.");
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
