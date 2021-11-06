package day17;

import java.util.Calendar;

public class CalEx04 {
	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();
		
		date.set(2021, 4, 31); // 2021 / 5/ 31
		
		System.out.println(dateToString(date));
		System.out.println("     = 1일 후=");
		date.add(Calendar.DATE, 1 );
		System.out.println(dateToString(date));
		
		System.out.println("    = 3달 전 =");
		date.add(Calendar.MONTH, -3);
		System.out.println(dateToString(date));
		
		System.out.println("    = 31일 후 =");
		// date.roll(Calendar.DATE, 31);
		date.add(Calendar.DATE, 31);
		System.out.println(dateToString(date));
		
		
		
		
	}
	public static String dateToString(Calendar date) {
		// date.get(Calendar.DAY_OF_WEEK) =>1~7 =>d인덱스 번호로 사용
		final String [] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) +1) + "월 "
				+ date.get(Calendar.DATE) + "일 " + DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)] + "요일 ";
		
	}
}
