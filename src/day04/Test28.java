package day04;

import java.util.Scanner;


public class Test28 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			System.out.println("정수 입력 >>");
			num = Integer.parseInt(sc.nextLine());
			System.out.println(num);
			if(num ==3) { //입력받은 숫자가 3과 동일하면
				break;	// 무한반복 빠져나가기 (종료시점)
			}
			
		}
		
		System.out.println("프로그램 종료!");
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
	}

}
