package day11;

// default 클래스 : 같은 패키지만 공개
class Sample {
	// 인스턴스 변수
	public int a; // 모든 클래스
	private int b;// 클래스내
	protected int c; // 동일패키지와 자식 클래스 ㄱ
	int d; // 
}



// public 클래스 : 전체 공개
public class ClassEx40 {
	public static void main(String[] args) {

		Sample s = new Sample();
		s.a = 10;
		//s.b = 20; // 접근 불가, 부르고 있는 위치가 ClassEx40의 main이기 때문에
		s.c = 30;
		s.d =40;
		
		
	
	}

}
