package day13;

class A2 {
	A2 () {
		System.out.println("생성자 A");
	}
	A2 (int x) {
		System.out.println("생성자 A-param :" + x);
	}
}
class B2 extends A2 {
	B2 () {
		//super (); 생략하면 컴파일러가 부모의 기본생성자를 호출
		System.out.println("생성자 B");
	}
	B2 (int x) {
		super(100); //  부모에 잇는 매개변수 생성자 호출
		System.out.println("생성자 B-param :" + x);
	}
}

public class InheritEx05 {

	public static void main(String[] args) {

		B2 b = new B2();
	}

}
