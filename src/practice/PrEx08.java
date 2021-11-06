package practice;
//문제 1. 369게임 : 1~99 까지의 정수를 입력받고, 정수중에 3,6,9 중 하나라도 있는 경우 "박수짝" 출력
		// 두개 있는 경우 "박수 짝짝" 을 출력하는 프로그램을 작성하세요.
		// #String에서 문자한개를 char타입으로 가져오기 : charAt(인덱스번호)
		// String str = "hello"; System.out.println(str.charAt(1)); => 'e'
		// #String 변수에 들어있는 문자열의 개수를 구하는 메서드 :.length()
		// System.out.println(str.length()); ==> 5

import java.util.Scanner;

// 3 6 9 13  16 19 33 ....99
		
		// ?? 0 자리에만 3,6,9, 오는지 확인 true => 박수짝
		// ?? 1 자리에만 3,6,9 오는지 확인 true => 박수짝
		// ?? 0,1 자리에 모두 3,6,9  오는지 확인 true => 박수 짝짞
public class PrEx08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99까지의 정수를 입력하세요 >>");
		String num = sc.nextLine();
		String result = num;
		// 1~9까지의 한자리 수에서 3,6,9,가 나오면 박수짝 출력되게 하기
		if(num.length() ==1) {
			if (num.charAt(0)=='3' || num.charAt(0)=='6'|| num.charAt(0)=='9')
				result = "박수짝";
		} else { // 10~99까지의 두자리 숫자에서 일단 1의 자리에 3,6,9,가 있으면 박수짝 출력되게하고
			// 십의 자리 숫자에도 3,6,9, 가 있으면 박수짝 결과에 짝만 더 더해서 출력하기
			if (num.charAt(0) =='3' || num.charAt(0)=='6' || num.charAt(0)=='9') {
				result = "박수짝";
				if (num.charAt(1) =='3' || num.charAt(1)=='6' || num.charAt(1)=='9') {
					result += "짝";
				} 
			} else if (num.charAt(1) == '3'|| num.charAt(1) == '6' || num.charAt(1)== '9') {
				result = "박수짝";
			}
		}
		System.out.println(result);
		
		
	}
	
}
