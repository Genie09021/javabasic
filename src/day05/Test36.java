package day05;

import java.util.Scanner;

public class Test36 {

	public static void main(String[] args) {

		// 문제 1. 구구단 2단 출력 -> 
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ....
		/*
		int mul = 0;
		for (int i = 2; i<=2; i++) {
			
			for (int j=1; j<=10; j++) {
			mul = i*j;	
				System.out.println(i+" * "+j + " = " + mul );
			}	
		}
		다른 방법 
		//for (int i = 1; i< 10; i++) {
		 		System.out.println("2*" + i + "=" + 2*i);
		}
				
		// 문제 2. 구구단 단수를 입력ㄷ받아, 해당 단을 출력
		// 예 ) 단 입력 >> 3
		// 3 * 1 = 3
		// 3 * 2 = 6
		// 3 * 3 = 9
		// ....
		Scanner sc = new Scanner(System.in);		
		System.out.println("정수를 입력하세요>>");
		int num= sc.nextInt();
		
		int mul = 0;		
		for (int i = num; i<=num; i++) {
					
			for (int j=1; j<=10; j++) {						
				mul = i*j;	
				System.out.println(i+" * "+ j + " = " + mul );	
			}
				
		}
		
		
		// 문제 3. 구구단 전체 출력 (2단 ~ 9단)
		int mul = 0;
		for (int i = 2; i<=9; i++) {
			
			for (int j=1; j<=10; j++) {
			mul = i*j;	
				System.out.println(i+" * "+j + " = " + mul );
			}	
			System.out.println("-----------");
	
		}
		*/
		
		//문제 4. 구구단 전체 출력 (1~9단)
		// *** 1단 ***	*** 2단 ***	*** 3단 ***
		// 1 * 1 = 1
		// 1 * 2 = 2
		// ...
		// *** 4단 ***	*** 5단 ***
		// *** 7단 ***
		
		for (int i = 1; i<10; i+=3) {
			System.out.println("***" +i+ " 단 ***\t***" + (i+1) + " 단 ***\t***" + (i+2)+ " 단 ***" );	
			
			for (int j=1; j<10; j++) {		
				System.out.print(i+" * "+ j + " = " + i*j + "\t");
				System.out.print((i+1) +" * "+ j + " = " + (i+1)*j + "\t");
				System.out.println((i+2) +" * "+ j + " = " + (i+2)*j + "\t");
			}
		}
		
	} //main

} // class
