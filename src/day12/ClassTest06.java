package day12;
/*
하루할일을 표현하는 클래스 Day는 다음과 같다. 
한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요.
MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수,메서드를 작성하고
실행 예시처럼 입력, 보기, 끝내기 등의 3개의 기능을 작성하라. 
 -> 생성자, input(), view(), finish(), run() 메소드 만들기. 
#실행예시#
이번달 스케쥴 관리 프로그램. 
할일(입력:1, 보기:2, 끝내기:3) >> 1
날짜(1~30)? 1
할일? 자바공부

할일(입력:1, 보기:2, 끝내기:3) >> 2
날짜(1~30)? 1
1일의 할 일은 자바공부입니다.

할일(입력:1, 보기:2, 끝내기:3) >> 3
프로그램 종료.
*/
import java.util.Scanner;
class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	private int nDays; // 한달의 일수
	private Day [] days; // Day객체 배열 
	Scanner sc = new Scanner (System.in);
	MonthSchedule (int nDays) { 
		this.nDays = nDays;
		days = new Day[nDays]; // 배열 공간 만들기 (Day객체생성해서 저장가능해짐)
		for (int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	void run () {
		System.out.println("이번달 스케쥴 관리 프로그램");
		
		while (true) { // 메서드는 한가지의 기능한 하도록 분리시킴
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>"); 
			int menu = Integer.parseInt(sc.nextLine());
		  
			 switch (menu) { 
			 	case 1 :input (); break;
			 	case 2 :view();break;
			 	case 3 : finish(); return;
			 	default :
			 		System.out.println("번호 입력을 잘못하셨습니다.");
			 
			 }  // switch
		} // while 
	}// run
	void input () {
		System.out.println("날짜(1~" + nDays  + ")?");
		  int day = Integer.parseInt(sc.nextLine());
		  System.out.println("할일?");
		  String w = sc.nextLine();
		  // 저장
		  days[day-1].set(w);
	}
	void finish () {
		//sc.close();
		System.out.println("프로그램 종료");
	}
	void view () {
		//날짜(1~30)? 1
		System.out.println("날짜(1~" + nDays  + ")?");
		int day = Integer.parseInt(sc.nextLine());
		//	1일의 할 일은 자바공부입니다.
		System.out.println(day + "일의 할일은");
		days[day-1].show();
	}
}

public class ClassTest06 {
	public static void main(String[] args) {
		
		MonthSchedule feb = new MonthSchedule(28); // 2월의 할일 
		feb.run();
		MonthSchedule may = new MonthSchedule(31); // 5월달의 할 일, 31이라는 데이터를 받는 매개변수 생성해줘야햄/
		may.run();
		
		
	}
}
