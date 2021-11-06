package practice;

import java.util.Scanner;

public class PrEx02 {

	public static void main(String[] args) {
		// 문제 1-1. arr이라는 이름의(방5개) 하나의 배열에 사용자로부터 서로 다른 5개의 정수를 입력받아 저장해보고 출력.
		
		int [] arr = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("서로 다른 5개의 정수를 입력하세요 >>");
		for (int i = 0; i < arr.length; i++) {
			arr [i] = sc.nextInt();
			System.out.println(arr[i]+ "\t");
		}
		
		// 문제 1-2. 위에서 만든 배열 arr에 저장된 값들을 오름차순으로 정렬하여 출력
		/*
		for (int i = 0; i< arr.length; i++) {
			for (int j = 0; j <arr.length; j++) {
				if ( arr[i] < arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println("====오름차순====");
		for (int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		// 문제 1-3. 정수 한개를 더 입력받아 저장하기.
		// 입력받은 정수는 기존 배열의 마지막 데이터 다음방에 저장되어야 한다. 
		//단, 배열은 문법적으로 방크기 수정이 불가하고, 데이터가 하나더 추가되려면 방이 6개여야 한다.
		System.out.println("정수를 하나 더 입력하세요>>");
		int num2 = sc.nextInt();
		//arr을 잠시 다른 곳으로 복사해 놓는것임.
		int [] temp = arr;
		//arr을 다시 방 6개로 만들어 준것임.
		arr = new int [6];
		for (int i = 0; i< temp.length; i++) {
			arr[i] = temp[i];
		}
		arr[5] = num2;
		for (int i = 0; i< arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
