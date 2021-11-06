package day17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx02 {
	public static void main(String[] args) {
			/*
		// 클래스가 자동으로 안잡힐때, 내가 만들거나 외부에 있을때.
		// "java.util.Date"
		try {
		Class cls = Class.forName("java.util.Date"); // Date cls 
		
		Object obj = cls.newInstance(); // = new Date();
		if (obj instanceof Date) { // 다형성
			Date d = (Date)obj;
			System.out.println(d);
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		//D-day 계산기 만들기 하루는 86,400초 
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DAY_OF_MONTH);
		int day = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		final String [] DAY_OF_WEEK = {"", "일","월","화","수","목","금","토"};
		System.out.println("현재시간 : " +year+ "년 " + month+ "월 " +  date + "일 " + DAY_OF_WEEK[day] + "요일 "
				+ hour + "시 " +min + "분 " + sec + "초");
		
		System.out.println(today.getTimeInMillis());
		Calendar dday = Calendar.getInstance();
		dday.set(2021, 11, 25);
		System.out.println(dday.getTimeInMillis());
		
		// 일수만 구하면 되니까 밀리세컨즈인 1000, 1분이 60초, 1시간이 60분, 1일이 24시간으로 계산해서 모두 곱한것에서 나누기
		long difference = (dday.getTimeInMillis()- today.getTimeInMillis())/(24*60*60*1000); 
		System.out.println("D-day까지 남은 날은 : " + difference + "일 입니다.");
	}

}
