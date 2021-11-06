package day06;

public class Test38 {
	public static void main(String[] args) {

		// 배열 선언,
		// int a;
		int [] score;
		// a= 10;
		score = new int[5]; // int형 배열 방 5개 만들기.
		// int a = 10;
		// 배열 선언 + 생성
		int [] num = new int[3]; // 공간 만들고 값저장 x 
		
		//값 저장 
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		//값 출력
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		//System.out.println(num);// 주소출력
		
		// int a = num; 이건 안댕 a = 값저장 num = 주소저장
		int a = num[0];
		System.out.println(a);
		
		System.out.println(num.length); //방의 개수
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("-----------------");
		
		for (int i=0; i <3; i++) {
			System.out.println(num[i]);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} //class
