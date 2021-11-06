package day17;

import java.util.Calendar;

public class CalEx02 {
	public static void main(String[] args) {

		Calendar date1 = Calendar.getInstance(); // 현재
		Calendar date2 = Calendar.getInstance();
		date2.set(2021,11,25); // set(int year, int month, int day)
		System.out.println(dateToString(date1));
		System.out.println(dateToString(date2));
		// 출력 형태 "????년 ??월 ??일 ?요일 "
		
	
	}
	
	public static String dateToString(Calendar date) {
		// date.get(Calendar.DAY_OF_WEEK) =>1~7 =>d인덱스 번호로 사용
		final String [] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) +1) + "월"
				+ date.get(Calendar.DATE) + "일" + DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)] + "요일";
		
	}
	
	
	

}
