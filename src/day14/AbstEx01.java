package day14;
// 추상 클래스
abstract class Super {
	abstract void add(); // 추상메서드 (메서드의 선언부; 으로 구성됨, 구현부 없음.)
	abstract void test();
	int a = 10;
	void ddd() { // 선언부
		//... 구현부
	}
}
class Sub extends Super { // a, ddd(), @add()
	void add() {}
	void test () {}	
	
}


public class AbstEx01 {
	public static void main(String[] args) {

		//Super s = new Super (); // 추상클래스 객체 생성 불가
		Sub s = new Sub();
		System.out.println(s.a);
		s.add();
		s.ddd();
	}

}
