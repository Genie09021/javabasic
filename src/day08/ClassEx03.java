package day08;

// #1. 클래스 정의
class Tv {
	boolean power = false;
	int vol = 0, ch = 1;
	
}
public class ClassEx03 {
	public static void main(String[] args) {

		//#2. 객체 생성
		Tv t;			//선언
		t = new Tv();	//생성 : 메모리가 Tv 크기만큼 생성되는 시점.
		// Tv t = new Tv(); 선언 + 생성 
		
		//#3. 사용
		System.out.println(t.power);
		System.out.println(t.vol);
		System.out.println(t.ch);
	
		//#4. 객체 여러개 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		// 클래스명 @객체 고유번호(주소)
		
		// 객체는 각각 따로 데이터 저장.
		t1.ch = 10;
		t2.ch = 20; // t2.ch를 주석처리하게 되면 맨처음에 갖고 있던 1이 출력됨.
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		
		// 같은 타입끼리 대입 가능
		int a =10;
		int b =20;
		a =b;
		b=a;
		
		// 같은 타입 가능 
		t1 = t2; // 둘다 Tv타입
		t3 = t2; // 둘다 Tv타입
		// 불가능
		//t1 = t2.ch; // t1은 Tv타입 . t2.ch은 int 타입
		// 가능
		t1.ch = t2.ch; // t1은 Tv타입 . t2.ch은 int 타입
		
		//ClassEx03도 클래스라서 객체생성가능, 자기자신 생성가능.
		ClassEx03 cls = new ClassEx03();
		
		String s = new String();
		
		int [] arr = new int[5];
		
	}

}
