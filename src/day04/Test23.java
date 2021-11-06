package day04;

import java.util.Scanner;

public class Test23 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();
			
		// 문제 1. 정수 2개를 입력받고, 몫과 나머지를 출력하세요.
		/*System.out.println("첫번째 숫자를 입력하세요>>");	
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자를 입력하세요>>");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("몫 : " + num1 / num2);
		System.out.println("나머지 : " + num1 % num2);
		*/
		
		
		// 문제 2. 일수(day)를 입력받고, 몇개월 몇일인지 출력해보세요.		
		// 단, 한달은 30일로 고정.
		/*System.out.println("일수를 입력하세요>>");
		int day = Integer.parseInt(sc.nextLine());
		System.out.println(day/30 + "개월" + day%30 + "일"); */
		
		
		//문제 3. 점수 3개를 입력받고, 총점과 평균을 구하여 출력해보세요.
		/*System.out.println("첫번쨰 숫자를 입력하세요>>");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자를 입력하세요>>");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("세번째 숫자를 입력하세요>>");
		int num3 = Integer.parseInt(sc.nextLine());
		int total = num1 + num2 + num3;
		double avg = total /3.0;
		System.out.println("총점 : " + total + "평균 :" + avg);
		
		
		System.out.println(num1 + num2 + num3);
		System.out.println((num1 + num2 + num3)/3);
		*/
		
		
		
		//문제 4. 숫자 하나를 입력받고, "음수"인지 "양수"인지 출력해보세요.
		/*System.out.println("숫자를 입력하세요 >>");
		int num = Integer.parseInt(sc.nextLine());
		if ( num < 0 ) {
			System.out.println("음수");
		} else if (num > 0){
			System.out.println("양수");
		} */
		
		
		
		//문제 5. 1~99 사이 숫자를 입력받고, "짝수"인지, "홀수"인지 출력해보ㅓ세요/
		/*System.out.println("숫자를 입력하세요 (1~99까지)>>");
		int num = Integer.parseInt(sc.nextLine());
		if ( num%2 == 0 ) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}*/
		
			
		//문제 6. 서로다른 정수 3개를 입력받고, 3개의 숫자 중 중간 크기의 수를 출력해보세요.
			//(평균값 X)
		
		System.out.println("첫번째 숫자를 입력하세요>>");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자를 입력하세요>>");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("세번째 숫자를 입력하세요>>");
		int num3 = Integer.parseInt(sc.nextLine());
		if (num1 > num2 && num1 < num3) {
			System.out.println(num1);
		} else if (num1 < num2 && num1 > num3) {
			System.out.println(num1);
		}
		if (num2 > num1 && num2 < num3) {
			System.out.println(num2);
		} else if (num2 < num1 && num2 > num3) {
			System.out.println(num2);
		} 
		if (num3 > num2 && num3 < num1) {
			System.out.println(num3);
		} else if (num3 < num2 && num3 > num1) {
			System.out.println(num3);
		} 
						
	
		
sc.close();	
		
		
		
	} // main

} // class
