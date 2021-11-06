package day14;

import java.util.Scanner;

//추상클래스
/*
	#1. Converter클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하세요. 
		main()메소드의 #1번 코드와 아래 콘솔 출력예를 참고하세요. 
		콘솔출력예)
			원을 달라로 바꿉니다.
			원을 입력하세요>>  24000 (<-사용자가 값 입력)
			변환결과: 20.0달러 입니다
			
	#2. Converter 클래스를 상속받아 Km를 Mile(마일)로 변환하는 Km2Mile 클래스를 작성하세요. 
		main()메소드 #2번 코드와 아래 콘솔 출력예를 참고하세요.
		콘솔출력예)
			Km을 mile로 바꿉니다.
			Km을 입력하세요>>  30(<-사용자가 깂 입력)
			변환결과: 18.75mile입니다
*/
abstract class Converter {
	abstract protected double convert(double src);	// 추상메소드
	abstract protected String getSrcString();			// 추상메소드 원을 입력받고
	abstract protected String getDestString();			// 추상메소드 달러를 입력받고
	protected double ratio;							// 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println(getSrcString() + "을 "+getDestString()+ "로 바꿉니다."); // getSrcString 원을 입력받고 getDestString 달러를 입력받고.
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환결과: "+res+getDestString()+"입니다");
		scanner.close();
	}
}
class Won2Dollar extends Converter { // ratio, run, @추상메서드 3개Converter 클래스를 상속받는 Won2Dollar
	//생성자
	public Won2Dollar (double ratio) {this.ratio = ratio;}
	
	// 오버라이딩 3개
	protected double convert(double src) {return src/ratio;}
	protected String getSrcString () {return "원";}
	protected String getDestString() {return "달러";}
	
}
class Km2Mile extends Converter {
	public Km2Mile (double ratio) {this.ratio = ratio;}
	protected double convert (double src){return src/ratio;} 
	protected String getSrcString () {return "Km" ;}
	protected String getDestString () {return "mile";}
	
	
}



public class ClassTest11 {
	public static void main(String[] args) {
		//#1.
		//Won2Dollar toDollar = new Won2Dollar(1200);		// 1달러는 1200원
		//toDollar.run();		// 1번 풀고 나면 주석처리하고 2번 풀기 Scanner가 닫혀버려서 잘 실행이 안댐 그래서 주석처리하고 진행
		
		//#2. 
		Km2Mile toMile = new Km2Mile(1.6);			// 1마일은 1.6km
		toMile.run();
	}
}
