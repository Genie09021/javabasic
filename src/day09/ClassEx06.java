package day09;
/*
 	클래스 기본형 변수 : static 붙은 아이 : 바로 사용가능 "클래스명.변수명"
 	클래스 참조형 변수 
 	
 	인스턴스 기본형 변수 : new로 객체 생성 후 사용가능 : "참조변수명.변수명"
 	인스턴스 참조형 변수
 	
 	지역 기본형 변수 : 메서드안에서 만든다. 메서드가 끝나면 소멸
 	지역 참조형 변수 
 */
class TvTest {
	boolean power = false;
	int ch = 1, vol = 0; // 인스턴스 변수들 객체생성 후 사용가능
	
}
// 클래스
public class ClassEx06 {	// 공식처럼 : 클래스명.변수명

	static int a;		// 클래스 기본형  ClassEx06.a	default값 0
	static ClassEx06 c;	// 클래스 참조형  ClassEx06.c	default값 null
	static TvTest tv;	// 클래스 참조형  ClassEx06.tv	default값 null	 
	// static TvTest tv = new TvTest(); 가능	
	
	int x;							// 인스턴스 기본형 (0 자동초기화)
	TvTest t1 = new TvTest();		// 인스턴스 참조형
	// 자기자신의 타입으로 인스턴스 객체 생성하면 안됨!
	//ClassEx06 c2 = new ClassEx06(); // 인스턴스 참조형 
	ClassEx06 c2 = null;
	
	public static void main(String[] args) {
		// 메서드 영역

		// static int b = 100; 불가능 static 키워드는 메서드 밖에서 사용가ㅓ능
		
		// 지역변수
		int b;						// 지역 기본형
		TvTest tt = new TvTest();	// 지역 참조형 
		
		// 클래스 변수 사용 
		System.out.println(ClassEx06.a);
		System.out.println(ClassEx06.c);
		//NullPointerException: tv에 객체 생성된 적이 없음. tv가 비어있어서 = power, ch, vol이 만들어진적이 없음.
		//System.out.println(ClassEx06.tv);
		//System.out.println(ClassEx06.tv.power);
		
		if(ClassEx06.tv != null) {
			// null이 아닐때, 즉 tv안에 TvTest객체가 생성되어 있다면, 
			System.out.println(ClassEx06.tv.power);
		}else { // == null : 즉,tv안에 TvTest객체 생성이 안되어 있다면,
			ClassEx06.tv = new TvTest(); // 객체 생성하고,
			System.out.println(ClassEx06.tv.power); // power출력
		}
	
		// 선언 위치가 다르면 이름이 같아도 괜찮다.
		int a = 299;	// 지역변수
		
		System.out.println(a);
		//같은 static이 붙은 main에서 static이 붙은 a를 호출하기 떄문에
		//같은 클래스 안에서, 메모리 생성시점이 같은 아이들은 서로 바로 호출가능.
		// static <--> static, 인스턴스 <--> 인스턴스, 
		System.out.println(ClassEx06.a);
		
		
		int x = 200;
		System.out.println(x);
		// 메서드 안에서 변수의 우선순위
		// 지역 > 인스턴스 > 클래스 
	
		// 인스턴스 변수 사용
		ClassEx06 ccc = new ClassEx06();
		System.out.println(ccc.x);
		System.out.println(ccc.t1.ch);
		ccc.c2 = new ClassEx06();
		System.out.println(ccc.c2.x);
		
	
	} // 여기서 지역변수 소멸 

}
