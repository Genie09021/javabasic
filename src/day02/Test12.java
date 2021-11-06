package day02;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		
		// 이름 ,나이 , 혈액형, 주소 입력받아 출력해보기.
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력
		//입력받아 변수에 저장
		//출력
		System.out.println("이름을 입력해주세요>>");
		String name = sc.nextLine(); 
		System.out.println(name);
		
		System.out.println("나이를 입력해주세요>>");
		// String age = sc.nextLine();
		int ageInt = Integer.parseInt(sc.nextLine());
		System.out.println(ageInt);
		
		System.out.println("혈액형을 입력해주세요>>");
		String blood = sc.nextLine();
		System.out.println(blood);
		
		System.out.println("주소를 입력해주세요>>");
		String address = sc.nextLine();
		System.out.println(address);
		
		sc.close();
		
	}

}
