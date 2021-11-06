package day01;

public class Test02 {

	public static void main(String[] args) {
		
		// 변수의 선언
		boolean b; // true or false 저장 가능
		char ch;
		int i;
		double d;
		int a, c; // 같은 타입의 변수 여러개 선언
		
		// 변수 선언만 하면 사용 불가능. 에러!!!
		/* System.out.println(b); */
		// 변수에 값대입
		b = true;
		ch = 'A';
		i = 100;
		d = 1.234;
		d = 10.3456;
		System.out.println(d); 
		
		//변수 선언 + 초기화
		int abc = 10; 
		abc = 20;
		System.out.println(abc);
		
		abc = 20 +100;
		System.out.println(abc);
		
		String str;
		str = "hello";
		System.out.println(str);
		
		
	}

}
