package day10;

public class ClassEx16 {
	// 성립되는 버전 
	// 매개변수의 개수차이
	int getSum(int a, int b) {
		return a + b;
	}
	int getSum (int a, int b, int c) {
		return a + b + c;
	}

	//매개변수 타입차이
	int getMul (int a, int b) {
		return a * b;
	}
	double getMul (int a,double b) {
		return a * (int)b;
	}
	
	// 성립 안되는 버전
	/* 매개변수 개수와 타입이 동일해서 안됨. 리턴타입은 신경도 안씀! 
	1.
	int getsub (int a, int b) {
		return a - b;
	}
	double getsub (int a, int b) {
		return (double)a-b;
	}
	2.
	int getDiv(int a , int b) {
		return a/b;
	}
	int getDiv(int c , int d) {
		return c/d;
	} 
	*/
		
	public static void main(String[] args) {

		ClassEx16 cls = new ClassEx16();
		System.out.println(cls.getSum(10, 20, 30));
		
		System.out.println(cls.getMul(10, 20.0)); // 갯수와 데이터 타입을 보고 구분
		// 메서드 오버로딩은 자바 컴파일러에 의 판단되며, 
		//컴파일러가 이름이 같은 메서드들을 구분할 수 있으면 오버로딩 성공
		// 컴파일러가 이름과 매개변수의 개수/타입 일치하는 메서드를 찾아냄.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
