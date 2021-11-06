package day08;
// 클래스 정의 -> 객체 생성 -> 사용

// #1. 클래스 정의
class Person {
	// 속성(변수)
	String name = "";
	int age = 0;
	// 기능 (메서드)
	void eat() {
		System.out.println("먹는다");	
	}
	void talk() {
		System.out.println("말한다");
	}
}

public class ClassEx02 {
//변수	
	
	//메서드
	//메서드 (기능)
	public static void main(String[] args) { //프로그램 시작지점

		// 프로그램실행해서 결과를 봐야하기 때문에
		// 객체 생성하고 사용하는 코드를 여기에 적자.
		
		//#2. 객체 생성 
		Person p1 = new Person();
		
		//#3. 사용
		System.out.println("생성직후 age : " +p1.age);
		System.out.println("생성직후 name : " +p1.name);
		
		//#4. 데이터 저장
		p1.age = 10;
		p1.name = "피카츄";
		p1.eat();
		p1.talk();
		
		System.out.println("저장후 age : " +p1.age);
		System.out.println("저장후 name : " +p1.name);
		
	
	}

}
