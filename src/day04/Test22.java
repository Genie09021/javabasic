package day04;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		
		//#1. 
		// 점수가 60점 이상이면 "합격", 아니면 "불합격"
		int score = 70;
		if (score >= 60) {
			System.out.println("합격");			
		} else {
			System.out.println("불합격");
		}
		
		// #2. 
		// 점수를 입력받고, 90점 이상이면 "수", 80점 이상이면 "우", 70점 이상이면 "미", 그 이하는 "재시험" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(100점 만점)>>");
		int test = Integer.parseInt(sc.nextLine());
		if (test >= 90) {
			System.out.println("수");			
		} else if (test >= 80 ) {
			System.out.println("우");
		} else if (test >= 70) {
			System.out.println("미");
		} else  {
			System.out.println("재시험");
		}
		
		// 100 >= input <= 90 이렇게 쓰면 안됨.
		
		//if (input >= 90 && input <=100) {
			//System.out.println("수");
		//} else if (input >= 80 && input <90) {
			//System.out.println("우");
		//} 이런식으로 써도됨. && 양쪽 조건 모두 맞아야하니가 &&.
		
		
		
		
		
		
		
sc.close();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} // class
