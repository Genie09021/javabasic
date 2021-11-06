package day18;

import java.util.ArrayList;
import java.util.Scanner;

/*
Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아
ArrayList에 저장하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
평균을 출력하는 프로그램을 작성하세요.
실행예시:
	6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>	 A C A B F D
	2.3333333333333335
*/
public class UtilEx02 {
	public static void main(String[] args) {
		// ArrayList에 저장
		ArrayList<Character> array = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in); // 슛자 입력받기
		System.out.println("6개의 학점을 빈 칸으로 분리 입력 >> "); // 출력문
		for (int i =0; i<6; i++) { // 반복문
			char c = sc.next().charAt(0); 
			array.add(c);
		}
		int sum = 0;
		for (int i = 0; i < array.size(); i++) {
			char c = array.get(i);
			switch (c) {
			case 'A' : 
				sum += 4;
				break;
			case 'B' : 
				sum += 3;
				break;
			case 'C' : 
				sum += 2;
				break;
			case 'D' : 
				sum += 1;
				break;
			case 'F' : 
				sum += 0;
				break;
			}	
		}
		double avg = (double) sum / array.size();
		System.out.printf("%.2f", avg);
		sc.close();
	}
}
