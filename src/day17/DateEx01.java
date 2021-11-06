package day17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {
	public static void main(String[] args) {

		Date day = new Date();
		System.out.println(day);
		System.out.println(day.getMonth() +1); // 0월 ~11월
		
		// 원하는 날짜 포맷으로 출력하고 싶을때 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 입니다"); // 얘네가 데이트를 가지고 있는건 아니고 형태만 만들어줌.
		System.out.println(sdf.format(day));
		
		
		
	}

}
