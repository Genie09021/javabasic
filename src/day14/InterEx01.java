package day14;

interface Test {
	//public static final int NUM =1; //상수
	//public abstract void add();		// 추상메서드
	
	// 생략버전
	int NUM =1;		//상수
	void add(); // 추상 메서드 원래 모양 public abstract void add(); 
}
interface Test2 {
	void sub ();
}

class A {}
class Inter extends A implements Test, Test2 {
	//public void add () {
		//System.out.println("implements");
	//}
	public void sub () {
		System.out.println(" dfd");
	}
	public void add () { // 생락버전이여도 앞에 public붙여야함
		System.out.println("implements");
	}
}



public class InterEx01 {
	public static void main(String[] args) {

		Inter i = new Inter ();
		i.add();
		System.out.println(i.NUM);
		System.out.println(Test.NUM); // 인터페이스명.NUM
		i.sub();
		// 다형성 
		Test t = new Inter ();
		
		
	}

}
