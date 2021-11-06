package day14;
// 아래 추상 클래스 Calculator를 상속받은 MyCalc클래스를 구현하세요.
abstract class Calculator {
	public abstract int add (int a, int b) ;		// 두 정수의 합 리턴
	public abstract int substract (int a, int b) ;	// 두 정수의 차를 리턴
	public abstract double average (int [] a) ;		// 배열에 저장된 정수의 평균값 리턴
}
class MyCalc extends Calculator {
	
	public int add (int a, int b) {
		return a+b;
	}
	public int substract (int a, int b) {
		return a-b;
	}
	public double average (int [] a) {
		int sum = 0;
		for (int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}




public class AbstEx02 {
	public static void main(String[] args) {
		
		MyCalc c = new MyCalc();
		System.out.println(c.add(10, 20));
		System.out.println(c.substract(10, 20));
		
		//int [] arr = new int [] {10,20,30,40,50};
		System.out.println(c.average(new int [] {1,2,3,4,5}));
	
	}
}
