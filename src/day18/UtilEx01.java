package day18;

import java.util.Scanner;
import java.util.Vector;

/*
Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 벡터에 저장하고,
벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요. 
실행예시:
	정수>> 10 6 22 6 88 77 -1
	가장 큰 수는 88
*/
public class UtilEx01 {
	
	
		// 벡터에 저장
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in); // 숫자 입력받자
		System.out.println("숫자를 입력하세요>>"); // 숫자 입력
		Integer max = v.get(0);	// 가장 큰 수 출력하기
		for (int i = 1; i<v.size(); i++) {
			if (max < v.get(i)) {
				max = v.get(i);
			}
			System.out.println("가장 큰 수는 : " + max);
		}
		
		
		while (true) {
			int num = sc.nextInt(); // 숫자 입력받기
			if ( num == -1) { // 입력 받은 숫자가 -1이면 종료
				break;
			}
			v.add(num);
		}
		System.out.println(max);
		sc.close();
	
	}
}
