package day03;

public class Test18 {
	public static void main(String[] args) {

		// 비교 연산자 : > >= < <= == != : true / false의 결과가 나옴.
		int a = 10;
		int b = 0;
		boolean result = a > b;
		boolean result2 = a > b +20;
		System.out.println(result2);
		
		int c = 10;
		int d = 10;
		boolean result3 = a == b;
		System.out.println(result3);
		
		//논리 연산자 : 비교 연산식을 여러개 연결할 때 사용
		// && : and ; 둘중에 하나라도 거짓이면 거짓, 모두 참이여야 참.
		// || : or : 둘중에 하나라도 참이면 참, 모두 거짓이여야 거짓
		boolean r = a > b && b > 0;
		System.out.println(r);
		
		r = a > b || b > 0;
		System.out.println(r);
		
		boolean g = a < b || b > 0;
		System.out.println(g);
		
		// ! : not : 부정문 : 결과를 반대로 바꿔 true -> false, false -> true
		int e = 10;
		int f = 30;
		boolean res = e < f;
		System.out.println("res : " + !res);

		res = e > f && f >= 30;
		System.out.println(!res);
		
		res = e <= f + 10  || f <= 25;
		System.out.println(!res);
		
		//삼항 연산자 :		조건식(비교식) ? 참일때 값 : 거짓일때 값;
		int l = 10;
		int m = 5;
		String result4 = l < m ? "크다" : "작다";
		System.out.println( result4 );
		
		int result5 = l < m ? 1 : 0;
		System.out.println(result5);
		
		char result6 = l > m ? 'O' : 'X';
		System.out.println(result6);
		
		int result7 = l > m ? l : m; // 삼항 연산자로 큰수 찾기 
		System.out.println(result7);
			
		
	}

}
