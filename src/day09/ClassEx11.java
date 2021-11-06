package day09;

// 계산기 클래스 : 입력값, 리턴값 모두 있는 형태
class Calc {
	// 덧셈 sum, 뺼셈 sub, 곱셈 mul, 나눗셈 div
	// 입력값 o, 리턴값 o
		int sum (int a, int b) {
			int res1 = a + b; 
			return res1;
		
			// return a +b; 위의 두줄을 이렇게 써도됨 
		}
		int sub (int a, int b) {
			int res2 = a - b; 
			return res2;
			// return a - b; 위의 두줄을 이렇게 써도됨 
		}
		int mul (int a, int b) {
			int res3 = a * b; 
			return res3;
			// return a * b; 위의 두줄을 이렇게 써도됨 
		}
		double div (int a, int b) {
			if (b ==0) {
				System.out.println("0으로 나눌수 없습니다");
				return 0.0;
			} else {
				return (double) a/b;
			}
			// return a / b; 위의 두줄을 이렇게 써도됨 
		}
		int rem (int a, int b) {
			return a % b;
			// return a % b; 위의 두줄을 이렇게 써도됨 
		}
}


public class ClassEx11 {
	public static void main(String[] args) {
		
		Calc c = new Calc();
	/*
		int res1 = c.sum(200, 100);
		System.out.println(res1);
		
		int res2 = c.sub(200, 100);
		System.out.println(res2);
		
		int res3 = c.mul(200, 100);
		System.out.println(res3);
	
		int res4 = c.div(200, 100);
		System.out.println(res4);
		
		int res5 = c.rem(200, 100);
		System.out.println(res5);
	*/
		
		// int result = calc.sum(10,20);
		System.out.println(c.sum(10,20));
		System.out.println(c.sub(10,20));
		System.out.println(c.mul(10,20));
		System.out.println(c.div(10,20));
		System.out.println(c.rem(10,20));
		
		
	}

}
// 산술 : 화폐매수구하기
// if : 직사각형, 홀수 짝수
// while : 카페프로그램
// for : 별찍기 10
// 배열 : 아파트
// 
