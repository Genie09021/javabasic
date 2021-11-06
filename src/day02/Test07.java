// 연습 문제1
package day02;

public class Test07 {

	public static void main(String[] args) {
		//문제1. 정수형 변수 a,b를 만들고 각각 10,20을 대입하고, 
        //값을 서로 교환해서 출력해보세요. 단 형태는 System.out.println(a + " " + b);로 출력
		
		//정수형 변수 a,b를 만들기
        int a, b;
		// 각각 10, 20 대입
        a = 10; 
        b = 20;
        // 위에 처럼 3단계로 나눠서 해도되고 아니면 int a = 10; int b = 20; 해도 똑같다.
        // 교환 전에 먼저 출력해보면
        System.out.println(a +" " + b); //10 20 <-이렇게 출력이 된다

		// a와 b 변수에 들어있는 값을 서로 교환 
		// 값을 교환하기 위해서는 값을 잠시 담아놓을 수 있는 공간을 만들어 준다.
        int temp = a; // 임시 변수 temp에 a의 값을 잠시 저장해 놓고
        a = b; // b가 들고 있는 값을 a에 덮어쓰게 하고
        b = temp; // temp에 잠시 저장해둔 a의 값을 b에 덮어쓰기 해준다.
        //출력해보면 20 10이 나온다
        System.out.println(a +" " + b); //20 10		
       
	} // main

} // class

