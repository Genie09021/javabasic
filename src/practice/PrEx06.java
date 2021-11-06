package practice;

import java.util.Scanner;

public class PrEx06 {

	public static void main(String[] args) {

		// 문제1. 2차원 배열 arr을 출력해보세요. 
		/*
			1
			1  2  3
			1
			1  2  3  4
			1  2
		
		// 비정방 배열 
		int [][] arr = {{1}, {1,2,3},{1},{1,2,3,4},{1,2}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		*/
		
		// 문제2. Scanner로 소문자 알파벳 하나 입력받고, 아래와 같이 출력되게 해보세요.  --> ascii 코드와 호환
		/* 콘솔예시)
			소문자 알파벳 하나를 입력하세요>> e (<--사용자가입력)
			abcde	97 98 99 100 101
			abcd	97 98 99 100
			abc		97 98 99 
			ab		97 98
			a		97
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요 >>");
		String alpha = sc.nextLine();
		// 아스키 코드 a= 97 
		char c = alpha.charAt(0);
		for (int i = c; i>=97; i--) {
			for (int j = 97; j<i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		
		*/
		
		
		// 문제3. 양의 정수 10개를 입력받아 배열에 저장하고, 3의 배수만 출력하는 프로그램 작성해보세요.
		/*
		Scanner sc = new Scanner(System.in);
		int [] num = new int [10];
		System.out.println("양의 정수 10개를 입력하세요 >> ");
		for (int i =0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("이 숫자 중 3의 배수는 : ");
		for (int i=0; i< num.length; i++) {
			if ( num[i] %3 == 0) {
				System.out.print(num[i] + " ");
			}
		}
		*/
		
		
		// 문제4. 4x4의 2차원 배열(총16개방)을 만들고, 1 ~ 10까지 범위의 정수를 10개만 랜덤하게 생성하여 
		// 임의의 위치에 저장하세요. 동일한 랜덤값이 있어도 상관없으며, 
		// 나머지 6개의 숫자는 모두 0 으로 만드로 4x4 형태로 출력
		/*
				ㅇ출력예)
				3  0  7  2
				0  8  1  4
				2  6  0  5
				0  0  7  0
		
		*/
		int [][] arr = new int [4][4];
		int x = 0;
		int y = 0;
		int random = 0;
		// random수 10번 반복 
		while (random < 10) {
			// 배열은 int [4][4]까지만 이니까 x인덱스와 y인덱스의 값은 0~4까지만 가능 
			x = (int)(Math.random()*4);
			y = (int)(Math.random()*4);
			// 만약 arr[x][y]의 자리에 값이 없다면 1~10 정수 넣기 
			if ( arr[x][y] == 0) {
				//1~10 까지의 정수 랜덤하게 생성
				arr[x][y] = (int)(Math.random()*10 +1);
				// 끝나면 random 하나씩 증가하면서 반복
				random ++;
			} 
		}
		// 다시 정렬
		for (int i = 0; i< arr.length; i++) {
			for (int j =0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
