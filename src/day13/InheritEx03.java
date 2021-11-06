package day13;

class A { //  단일 클래스 (부모 없는 애들)
	A () {
		System.out.println("생성자 A");
	}
}
class B extends A{
	B () {
		System.out.println("생성자 B");
	}
}
class C extends B{
	C () {
		System.out.println("생성자 C");
	}
}

public class InheritEx03 {
	public static void main(String[] args) {

		C c = new C(); // C로 가보니 부모가 B, B로 가니 부모가 A, A는 단일 클래스여서 A부터 실행.
		
		
		
	}

}
