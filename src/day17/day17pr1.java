package day17;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class day17pr1 {

	public static void main(String[] args) {

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
	
		
		
		today.set(2021, 11,25);
	
		System.out.println(dateToString(today));
		System.out.println("= 10일 전 =");
		today.add(Calendar.DATE, -10);
		System.out.println(dateToString(today));
		
		System.out.println("= 5달 후 =");
		today.add(Calendar.MONTH, 5);
		System.out.println(dateToString(today));
		
		System.out.println("= 10년 후 =");
		today.add(Calendar.YEAR, 10);
		System.out.println(dateToString(today));
		
		// 날짜 입력 받기 -> 현재 시간이랑 차이 구하기
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		
		Date date1 = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력하세요 >>");
		String str = sc.nextLine();
		try {
			date1 = df.parse(str);
			System.out.println(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static String dateToString(Calendar today) {
		
		return today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH)+1) + "월 "
				+ today.get(Calendar.DATE) + "일 ";
		
		
		
		
		
	}

}
