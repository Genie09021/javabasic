package day18;
//HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램을 작성하세요. 
		// 아래 프로그램 메뉴에서 각 번호로 서비스를 선택하고, 
		// 6번 종료를 입력받으면 프로그램 종료. 
		/*
			** 자바 성적 관리 프로그램 **
			1. 전체 조회
			2. 등록
			3. 수정
			4. 삭제
			5. 전체 평균
			6. 프로그램 종료 
		*/
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class HashEx03 {
	private HashMap<String, Integer> map;
	private Scanner sc;
	
	HashEx03 (){
		map  = new HashMap<String, Integer> ();
		sc = new Scanner(System.in);
	}
	void printAll () {
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			System.out.println(name + "  " + score);
		}
		System.out.println("=============================");
	}
	void insertData () {
		System.out.print("이름 입력하세요>>");
		String name = sc.next();
		Set<String> keys = map.keySet();
		if (keys.contains(name)) {
			System.out.println("이미 존재하는 학생입니다. 이름을 다시 확인해주세요.");
			insertData();
			return;
		}else {
			System.out.print("점수 입력하세요>>");
			int score = sc.nextInt();
			map.put(name, score);			
			System.out.println("저장 완료.");
		}
		
	}
	void modifyData () {
		System.out.println("수정할 학생 이름 >>");
		String name = sc.next();
		Set<String> keys = map.keySet();
		if (keys.contains(name)) { // 수정할 학생의 이름이 존재한다.
			System.out.println("점수 >>");
			int score = sc.nextInt();
			map.put(name, score);
			System.out.println("수정 완료!");
		} else {
			System.out.println("존재하지 않는 학생입니다.");
		}
		System.out.println("=========================");
	}
	void deleteData () {
		System.out.println("삭제할 학생 이름 >>");
		String name = sc.next();
		Set<String> keys = map.keySet(); // keyset으로 이름 다 가져오기 
		if (keys.contains(name)) { //key들 중에서 name을 포함하고 있니. 포함하고 있으면 map. remove, 포함 하지 않으면 else뒤에 진행.
			map.remove(name);
			System.out.println("삭제 완료!");
		}else {
			System.out.println("존재하지 않는 학생입니다.");
		}
		System.out.println("=======================");
	}
	void printAvg () {
		Collection<Integer> coll = map.values();
		Iterator<Integer> it = coll.iterator();
		int sum =0;
		while (it.hasNext()) {
			int value = it.next();
			sum += value;
		}
		double avg = (double)sum / map.size();
		System.out.printf("평균 점수 : " + "%.2f", avg);
	}
	
	
	public static void main(String[] args) {
		
		HashEx03 prg = new HashEx03();
		while (true) {
			System.out.println("** 자바 성적 관리 프로그램 **");
			System.out.println("1. 전체 조회\r\n" + "2. 등록\r\n" + "3. 수정\r\n"
					+ "4. 삭제\r\n" + "5. 전체 평균\r\n" + "6. 프로그램 종료 ");
			System.out.println("원하는 서비스 번호 입력>>");	
			int sel = prg.sc.nextInt();
			if (sel ==1) {prg.printAll();	}
			else if ( sel ==2) {prg.insertData();}
			else if ( sel ==3) {prg.modifyData();}
			else if (sel ==4) {prg.deleteData();}
			else if (sel ==5) {prg.printAvg();}
			else if (sel ==6) {System.out.println("시스템 종료"); break;}
			else {System.out.println("잘못된 번호.. 다시 입력하세요>>");}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
