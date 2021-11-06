package day04;

import java.util.Scanner;

public class Test29 {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		
		//while문 문제
		//문제 1. 0~10 까지 출력 --해결
		/*
		int n = 0;
		while (n<11) {
			System.out.println(n);
			n++;
		}
		*/
		
		//문제 2. 1~15 까지 출력 --해결
		/*
		int n = 1;
		while (n<16) {
			System.out.println(n);
			n++;
		}
		*/
		//문제 3. 0~100 까지 10 단위로 출력. --해결
		/*
		int n = 0;
		while (n<=100) {
		 	if(n%10 ==0 ) {	
		 		System.out.println(n);
		 	}
		 	n++;
		 }
		*/
		
		//문제 4. 1~20 까지 홀수만 출력 --해결
		/*
		 int n = 0;
		 while (n<=20) {
		 	if(n%2 ==1 ) {	
		 		System.out.println(n);
		 	}
		 	n++;
		 }
		 */
		
		
		//문제 5. 1~10 까지의 총 합 출력 --해결
		/*
		 int sum = 0; 
		 
		 int n = 1;
		 while (n<= 10) {
		 	sum += n;
		 	n++;		 	
		 }		 
		 System.out.println((n-1) + sum);		 
         */
       		
		//문제 6. 1~50 까지의 짝수의 총 합 출력 --해결
		/*
		int sum = 0;
		 int n = 0;
		 while (n<=50) {
			 if(n%2==0) {
			 sum += n;
			 }
			 n++;
		 }
		 
		 System.out.println(sum);
		 */
		 
		 
		
		//문제 7. 주문 프로그램 - 무한반복
		
		/*
		 ***글로벌 카페 메뉴 ***
		 1. 아메리카노	:2500원
		 2. 카페라떼	:3000원
		 3. 카푸치노	3000원
		 4. 카라멜프라푸치노	:4000원
		 5. 햄치즈샌드위치	:6000원
		 6. 종료
		 
		 1단계 : 위 메뉴를 콘솔에 출력하고, 종료(6번)를 선택할때까지 반복해서 메뉴 번호로 주문을 받고, 
		 		종료 선택후 총 주문 금액 출력
		 2단계 : int money = 20000; 내 돈에서 주문시주문금액 차감, 돈이 부족하면 주문 추가 불가, 
		 		종료시 총액 출력, 잔액도 출력	 
		
		int num = 0;
		int price = 0;
		
		while (true) {
			System.out.println("1. 아메리카노	:2500원");
			System.out.println("2. 카페라떼	:3000원");
			System.out.println("3. 카푸치노	:3000원");
			System.out.println("4. 카라멜프라푸치노	:4000원");
			System.out.println("5. 햄치즈샌드위치	:6000원");
			System.out.println("6. 종료");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("주문하실 번호를 입력해주세요>>");
						
			num = sc.nextInt();
			
			if (num == 1) {
				price = 2500;
			}else if(num ==2) {
				price = 3000;
			}else if(num ==3) {
				price = 3000;
			}else if(num ==4) {
				price = 4000;
			}else if(num ==5) {
				price = 6000;
			}else if (num ==6) {
				System.out.println("주문 종료");
			}
			if((num==1) ||(num==2)||(num==3)||(num==4)||(num==5)) {
				
				System.out.println("지불할 총 금액 : " + price);
				int money = sc.nextInt();
			}

		}
			*/
			
		
		//문제 8. -1이 입력될대까지 정수를 계속 입력받아, -1 입력시 총합과 평균을 출력하는 프로그램
		/*
		Scanner sc = new Scanner(System.in);		
		int num = 0;
		int count = 0;
		int sum = 0;
		
		do {
			System.out.println("정수를 입력하세요>>");
			num = sc.nextInt();
			sum += num;
			count++;
		}
		while (num!= -1);
		sum += 0;
		System.out.println(sum);
		*/
		
		
		//문제 9. 문자열을 계속 입력받고 출력하되, "exit"를 입력받으면 종료되는 프로그램 
		//*힌트 문자열 비교는 == 불가, String의 기능중 equals()사용
		// String str = "abc";
		// System.out.println(str.equals("abc")); => true 출력
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		do {			
			System.out.println("프로그램을 종료하려면 exit를 입력하세요");
			System.out.println("문자를 입력하세요>>");
			str = sc.nextLine();
		} while (!str.equals("exit"));
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
	}

}
