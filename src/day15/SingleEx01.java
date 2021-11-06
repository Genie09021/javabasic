package day15;

class SingleT {
	// 싱글턴으로 만들기
	private static SingleT instance = new SingleT();
	private SingleT() {}
	public static SingleT getInstance () {return instance;}
	
	// 일반 인스턴스 변수
	int a = 100;
	
	// 일반 인스턴스 메서드 : 객체 생성후 사용가능
	void func () {
		System.out.println("싱글턴");
	}
}




public class SingleEx01 {
	public static void main(String[] args) {

		// SingleT s = new SingleT(); 외부에서 객체생성 불가능
		SingleT s = SingleT.getInstance(); // 객체한개 생성된거 얻어다 사용
		s.func();
		System.out.println(SingleT.getInstance()); // 
		
		SingleT s1 = SingleT.getInstance();
		
		System.out.println("s.a : " + s.a);	//100
		System.out.println("s1.a : " + s1.a);	//100
		s.a = 200;
		System.out.println("s.a : " + s.a); //200
		System.out.println("s1.a : " + s1.a);//200
		
		System.out.println(s);
		System.out.println(s1); // s,s1주소 같음.
		
		
		
	}

}
