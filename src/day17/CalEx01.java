package day17;

import java.util.Calendar;

public class CalEx01 {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance(); // 캘린더 쓸땐 항상getInstance();
		System.out.println(now);
		
		// 년도 출력
		int year = now.get(Calendar.YEAR); // get은 int타입
		System.out.println(year);
		
		// 월 출력 
		int month = now.get(Calendar.MONTH) +1; // MONTH는 0~11월까지만 잇음.
		System.out.println(month);
		
		// 요일 출력 일=1 월 화 수 목 금 토=7
		int day = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
			
	}

}
