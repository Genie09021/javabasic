package day03;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 문자열 입력받아 저장
		//String str = sc.nextLine();
		//정수 입력받아 저장
		//int num = Integer.parseInt(sc.nextLine());
		// 실수 입력받아 저장
		//double d = Double.parseDouble(sc.nextLine());
		
		
		
		// 문제 1. 숫자 2개를 입력받고, 사칙연산 결과를 출력해보세요.
		//	단, 0을 제외한 숫자 입력받기.
		//방법**** : 숫자 2개 입력받기
		//			입력하라고 메세지 띄워주기 ->출력문
			//System.out.println("숫자 1 입력 : ");
		//			입력받고, 받은거 변수에 저장하기 -> 변수도 필요
			//int num1 = Integer.parseInt(sc.nextLine()); // 문자열 입력받아 정수로 형변환 
		// 두번 반복하기
			//System.out.println("숫자 2 입력 : ");
			//int num2 = Integer.parseInt(sc.nextLine());
		// 사칙연산 결과 출력 + - * / %
			//System.out.println(num1 + num2);
			//System.out.println(num1 - num2);
			//System.out.println(num1 * num2);
			//System.out.println(num1 / num2);
			//System.out.println(num1 % num2);
			
		
		// 문제 2. 초단위로 정수를 입력받고, "?분, ?초" 형태로 출력해보세요.
		// 선생님 방법 메세지 출력
			//System.out.println("초를 입력하세요");
		// 입력받아 저장
			//int input = Integer.parseInt(sc.nextLine());
		// ?분 ?초 형태로 계산해서 출력
			//int min = input / 60;
			//int sec = input % 60;
			//System.out.println(min + "분" + sec + "초");
						
		/* 내가 풀어봤던 방법
		 * int min, sec;	
		sec = sc.nextInt();		
		min = sec / 60;
		sec = sec % 60;
		min = min % 60;
		System.out.printf("%d분 %d초", min, sec);
		*/
		
		// 문제 3. 초단위로 정술ㄹ 입력받고, "?시간 ?분 ?초" 형태로 출력
			//System.out.println("초를 입력하세요");
			//int input = Integer.parseInt(sc.nextLine());
			//계산 : 1분 == 60초 1시간 = 60분 ==3600초
			//int hour = input /3600;
			//int min = (input % 3600) / 60;
			//int sec = input % 60;
			//System.out.println(hour + "시간" + min + "분" + sec + "초");
			
		/*int hour, min, sec;
		System.out.println("초를 입력하세요>>");
		sec = sc.nextInt();
		
		min = sec / 60;
		hour = min / 60;
		sec = sec % 60;
		min = min % 60;
		System.out.printf("%d시 %d분 %d초", hour, min, sec);
		*/
		
		// 문제 4. 최소 화폐매수 구하기 : 금액을 입력하면, 최소한의 화폐 매수를 출력
			// 콘솔실행 예) 금액입력 >> 67800 (<-- 사용가자 입력하는 부분)
			// 5만원 : 1장, 1만원 :1장 ,5천원 :1장 , 1천원 : 2장, 5백원 : 1개, 1백언 :3개
			
			System.out.println("금액을 입력하세여 >>");
			int money = Integer.parseInt(sc.nextLine());
			System.out.println("5만원 :" + (money / 50000) + "장");
			System.out.println("1만원 :" + ((money % 50000)/10000) + "장");
			System.out.println("5천원 :" + ((money % 10000)/5000) + "장");
			System.out.println("1천원 :" + ((money % 5000)/1000) + "장");
			System.out.println("5백원 :" + ((money % 1000)/500) + "개");
			System.out.println("1백원 :" + ((money % 500)/100) + "개");
			System.out.println("5십원 :" + ((money % 100)/50) + "개");
			System.out.println("1십원 :" + ((money % 50)/10) + "개");
			
		/*System.out.println("금액을 입력하세요 >>");
		int n = sc.nextInt();
		int money = n / 50000;
		System.out.println("5만원 : "+ money+ "장");
		int money2 = (n-(money * 50000)) / 10000;
		System.out.println("1만원 :" + money2+ "장");
		int money3 = ((n%10000)/5000);
		System.out.println("5천원 : " + money3 + "장");
		int money4 = ((n%5000)/1000);
		System.out.println("1천원 : " + money4 + "장");
		int money5 = ((n%1000)/500);
		System.out.println("5백원 : " + money5 + "개");
		int money6 = ((n%500)/100);
		System.out.println("1백원 : " + money6 + "개");
		int money7 = ((n%100)/50);
		System.out.println("5십원 :" + money7 + "개");
		int money8 = ((n%50)/10);
		System.out.println("1십원 :" + money8 + "개");
		
		*/
		sc.close();
		
	}

}
