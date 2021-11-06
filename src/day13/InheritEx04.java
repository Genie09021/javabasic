package day13;

class A1 { // 특별한 수퍼 생성자 지정이 없으면 부모의 기본생성자가 실행
	
	A1 () {
		System.out.println("생성자 A");
	}
	
	A1 (int x) {
		System.out.println("생성자 A-param");
	}
}
class B1 extends A1 {
	B1 () {
		System.out.println("생성자 B");
	}
	B1 (int x) {
		System.out.println("생성자 B-param");
	}
}
	

public class InheritEx04 {

	public static void main(String[] args) {

		B1 b = new B1 (10);
		
	}

}
