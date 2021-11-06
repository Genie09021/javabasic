package day09;
/*
 	메모리 로딩 순서
 	클래스 -> static -> main 실행 -> (new~)instance
 	| 클래스 범위 
 */
class Test {
	
	// 메모리 로딩 순서가 달라서 아래처럼 쓸 수 없음. 
	//static int x = y;
	//int y = 10;
	
	// static이 붙은 변수는 프로그램시작시 먼저 메모리에 로딩되어 사용준비가 된다.
	// 선언할때 인스턴스가 먼저 작성되었다고 혼당하시면 안된다
	static int x = 100;
	int y = x;
	
	

}

//클래스
public class ClassEx05 {
	
	// 이곳에도 변수 선언 가능 
		static int a = 100;
		int i = 20;
	
	// 메인 메서드
	public static void main(String[] args) {
		
		System.out.println(Test.x);
		Test t = new Test();
		System.out.println(t.y);
		
		System.out.println(ClassEx05.a);
		System.out.println(a);
		ClassEx05 cls = new ClassEx05();
		System.out.println(cls.i);

		// 단발성, 1회성으로 한번만 i의 값을 출력하고 말겠다~~
		System.out.println();
	
	
	}

}
