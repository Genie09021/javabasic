package day07;

import java.util.Scanner;

public class ArrEx05 {

	public static void main(String[] args) {
		// *** 랜덤 ***
		
		//System.out.println(Math.random()); //0~1 사이의 실수
		// 0~9 사이 랜덤값을 출력
		//for (int i=0; i<20; i++) {
		//	System.out.println((int)(Math.random()* 10)); 				
		//}
		
		// 문제 0. 0~5사이 랜덤값 // 0 1 2 3 4 5
		//	System.out.println((int)(Math.random()* 6));
		
	
		//문제 1. 1~5사이 랜덤값 출력
			//System.out.println((int)((Math.random()* 5)+1));
			
		
		//문제 2. 12~17사이 랜덤값 출력  // 0~5사이
		//	System.out.println((int)((Math.random()* 6)+12));
	
	//for (int i =0; i <1; i++) {
	//		System.out.println((int)((Math.random()* 10)/2)+12);
	//	}	
		
	//	문제 3. 로또 번호 랜덤으로 생성하기
		//	1~45 사이 임의의 번호 6개 선택하고, 오름차순으로 정렬. -> 출력
		/*
		Scanner sc = new Scanner(System.in);
		int [] arr;
		arr = new int[6];
		for (int i =0; i<1; i++) {
			System.out.println((int)(Math.random()*50));
			System.out.println("1~45사이 임의의 번호 6개를 입력하세요>>");
			
		}
	
		for (int i  = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
			System.out.println(arr[i] );	
		}
		for (int i = 0; i< arr.length; i++) {
			for ( int j=0; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	
			*/
	       
	    int [] rotto = new int [6];
	    for (int i =0; i<rotto.length; i++) {
	    	rotto[i] = (int)(Math.random()*45) +1;
	    	// 처음부터 지금 뽑은것 전까지 반복해서
	    	// 지금 뽑은수가 이전수와 동일한지 검사
	    	for (int j=0; j<i; j++) {
	    		if (rotto[i] == rotto[j]) {
	    			i--;
	    			break;
	    		}
	    	}
	    }
		// 정렬하고 출력
		
		
	}

}
