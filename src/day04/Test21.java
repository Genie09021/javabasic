package day04;

public class Test21 {
	public static void main(String[] args) {

		/*
		if () {
			//참일때 실행할코드
		}
		*/
		
		int a = 20;
		if (a < 10) {
			System.out.println("10보다 크다");			
		} // false인 경우 출력 안하고 다음으로 건너뜀.
		
		
		if (a-10 >= 10) {
			System.out.println("출력???");				
			
		}
		
		int score = 70;
		//문제. 점수가 60점 이상이면 "합격", 아니면 "불합격"
		if (score >= 60) {			
			System.out.println("합격");			
			
		}
		if (score < 60) {
			System.out.println("불합격");
			
		}
		
		int score2 = 50;
		if (score >= 60) {
			System.out.println("합격");			
		} else {
			System.out.println("불합격");
		}
		
				
		
	} // main

} // class
