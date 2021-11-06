package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashEx02 {
	public static void main(String[] args) {

		// 영한 사전 만들기 : HashMap을 이용하여 10개의 단어를 영어, 한글의 쌍으로 저장.
		// 영어로 한글을 검색하는 프로그램을 만들어보세요.
		// 단, exit가 입력되면 프로그램 종료.
		
		HashMap<String, String> word = new HashMap<String, String>();
		word.put("love", "사랑");
		word.put("like", "좋아함");
		word.put("Only Jesus", "오직 예수");
		word.put("Thank", "감사");
		word.put("Sun", "태양");
		word.put("family", "가족");
		word.put("friend", "친구");
		word.put("church", "교회");
		word.put("community", "공동체");
		word.put("Korea", "한국");
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("영어 단어를 입력하세요 >>");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			String kor = word.get(str);
			if (kor == null) System.out.println(str + "없는단어");
			else System.out.println(kor);
		}
		
		sc.close();
		
	}

}
