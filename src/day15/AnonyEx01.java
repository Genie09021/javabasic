package day15;

interface MyInter { // 맨 앞에 abstract public생략되어있음 
	void func(); // 추상메서드 
	
}

public class AnonyEx01 {

	public static void main(String[] args) {

		//인터페이스 : -> 구현한 클래스 정의(오버라이딩) 
		//-> 구현 클래스 객체 생성해서 오버라이딩된 메서드 호출(.func) 사용 
		new MyInter () {
			@Override
			public void func() {
				System.out.println("MyIner의 func()오버라이딩된 메서드 호출");
			}
		}.func();	
	}
}
