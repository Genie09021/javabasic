package day06;

public class Test39 {
	public static void main(String[] args) {


		//반복문 사용
		int [] num = new int[5];
		// 저장
		for (int i = 0; i<num.length; i++) { // 0~9까지 : 인덱스번호로 활용
			num [i] = 100;  
		}
		// 출력 ㅣ 방에 접근해서 값을 출력
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		//초기화
		int [] arr = {1,2,3,4,5};
		for (int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String [] str = {"java" , "jsp" , "spring"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//문제. 최대값, 최소값 구하기 -- 비교 
		int [] score = {79,34,100,1,65,31,67,90,3};
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 0; i < score.length; i++) {
		    if(max<score[i]) {
		    	//max의 값보다 score[i]이 크면 max = score[i]
		    	max = score[i];
		        }
		    			
		        if(min>score[i]) {
		    	//min의 값보다 score[i]이 작으면 min = score[i]
		    	min = score[i];
		        }
		} 
		
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
