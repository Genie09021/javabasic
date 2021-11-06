package day05;

import java.util.Scanner;

public class Test34 {

	public static void main(String[] args) {
		//*for문
		/*
		//문제1. 10~30까지 출력
		for(int i = 10; i<=30; i++) {
			System.out.println(i);
		}
		
		//문제2. 0~100까지 10 단위로 출력 
		for(int i = 0; i<=100; i+=10) {
			System.out.println(i);
		}
		
		//문제3. 1~20까지 짝수만 출력
	
		for(int i = 0; i<=20; i+=2) {
			System.out.println(i);
		}
		
		
		for(int i = 0; i<=20; i++) {
			if (i%2 ==0 ) {			
			System.out.println(i);
			}
		}
		
		
		//문제4. 1~100까지의 홀수의 합 출력
		
		int sum = 0;
		for(int i = 0; i<=100; i++) { 
			if (i%2 == 1 ) {
			sum += i;			
			}
		}
		System.out.println(sum);
		
		
		*/
		//문제5. 정수 1개를 입력받고, 1부터 입력받은 수까지의 총합 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요>>");
		int num= sc.nextInt();
				// = Integer.parseInt(sc.nextLine());
		int tot =0;
		
		for (int i =1; i<=num; i++) {
			tot += i;
			System.out.println(i);
		}
		System.out.println(tot);
		
	}//main

}//class
