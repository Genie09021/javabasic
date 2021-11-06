package day02;

public class Test05 {
	public static void main(String[] args) {
		
		// 출력문 내 연산
		System.out.println(10+3);
		System.out.println("a"+"b");
		System.out.println("ab" + "cd");
		
		//출력문 내에 문자열이 하나라도 있으면 모두 문자로 연산처리 됨
		System.out.println("A" +10);
		System.out.println("A" +10 + 20);
		System.out.println("A" + (10+20));
		System.out.println(10+20 + "A");
		
		int a = 10;
		int b = 20;
		System.out.println(a+b + "hello");
		System.out.println(a+"hello" + b);
		System.out.println("hello" + true);
		
		System.out.println('A' + 10); //A의 아스키코드값이 65임을 알 수 있음.		
		System.out.println('B' + 10); //B의 아스키코드 값 = 66		
		System.out.println('0' + 10); //0의 아스키코드 값 = 48
		System.out.println('a' + 10); //a의 아스키코드 값 = 97

		System.out.print("hello");
		System.out.print("java");
		System.out.println("hahahaha");
		System.out.println("hi");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
