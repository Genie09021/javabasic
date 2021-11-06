package day09;
// Tv 클래스
// 1. 변수 : 값 저장 : 채널, 볼륨, 전원
// 2. 메서드 : 기능 : 전원 on/off, 볼륨 조정, 채널 조정, 채널 입력

class Tv {
	// 인스턴스 변수
	int ch = 1, vol = 0;
	boolean power = false;

	// 메서드
	void powerOnOff() {
		// 전원 껐다 켜기
		power = !power; 	
	}
	void volUp () {
		vol ++;		
	}
	// volDown, chUp, chDown 만들기
	void volDown () {
		vol --;
	}
	void chUp () {
		ch ++;
	}
	void chDown () {
		ch --;
	}
	void chChange (int c) { //  c= 23;
		 ch = c;
		 
	}
}

public class ClassEx09 {
	public static void main(String[] args) {

		Tv tv = new Tv();
		System.out.println("tv 생산 == 객체생성");
		System.out.println("power : " + tv.power); // false
		
		// 전원켜기
		tv.powerOnOff();
		System.out.println("power : "+ tv.power);
		System.out.println("티비가 켜졌네"); // true
		
		// 전원끄자
		tv.powerOnOff();
		System.out.println("power : " +tv.power); // false
		
		System.out.println("vol : " + tv.vol);
		tv.volUp();
		System.out.println("vol : " + tv.vol);
		
		System.out.println("vol : " + tv.vol);
		tv.volDown();
		System.out.println("vol : " + tv.vol);
		
		System.out.println("ch : " + tv.ch);
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		System.out.println("ch : " + tv.ch);
		tv.chDown();
		System.out.println("ch : " + tv.ch);
		
		System.out.println("ch : " + tv.ch);
		tv.chChange(23);
		System.out.println("ch : " + tv.ch);
		
		
		
		
		// return; void는 생략된고
		
	} // main

} // class
