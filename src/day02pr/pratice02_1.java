package day02pr;

import java.util.Scanner;

public class pratice02_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하랏>>");
		//String name = sc.nextLine();  이 줄은 삭제 가능 
		System.out.println(sc.nextLine());
		
		System.out.println("나이 입력 ::");
		String age = sc.nextLine();
		
		int ageInt = Integer.parseInt(age);
		//double ageDb = Double.parseDouble(age);
				
		System.out.println(age);
		
		
		
		
		
		
		sc.close();
		System.out.println("프로그램 종료");
		
	}

}
