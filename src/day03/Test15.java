package day03;

public class Test15 {
	public static void main(String[] args) {
		
		// 증감 연산자 : ++, --
		// 전위형 : 나먼저  ++a
		// 후위형 : 가장 나중에, 다른거 먼저 a++ 
		
		/*int a = 10;
		System.out.println(a);
		++a;
		System.out.println(a);
		a++;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		int b = 10;
		System.out.println(++b); // 증가하고 출력
		System.out.println(b++); // 출력하고 증가
		System.out.println(b);
		*/
		
		//문제 : 출력결과를 미리 주석으로 적어보고 실행해서 맞는지 확인.
		int i = 5, j = 5;
		System.out.println(i++);					//5 출력하고 난 다음엔 6이딤
		System.out.println(++j);					//6
		System.out.println("i=" + i + ", j=" +j);	//i=6  j=6
		
		int k = 10;
		System.out.println(k++);		// 10		출력하고난 다음엔 11 
		System.out.println(++k);		// 12		12출력 후 12
		++k;										// 13이댐
		System.out.println(++k);		// 14		14출력 후 14
		System.out.println(k++);		// 14		14추력 후 15
		System.out.println(k);			// 15		
		
		int a = 10;
		int b = 10;
		int r = ++a + ++b;
		System.out.println(r);			// 11 + 11 = 22
		r = ++a + b++;
		System.out.println(r);			// 12 + 11 = 23
		r = ++a + a;
		System.out.println(r);			// 13 + 13 = 26
		r = ++a + a++;
		System.out.println(r);			// 14 + 14 = 28
		r = ++a + ++a;
		System.out.println(r);			// 16 + 17 = 33 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
