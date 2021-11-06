package day09;

class Test3 {
	// 메서드 4개 종류
	// 1) 입력값 x, 리턴값 x,
	void test () {
		System.out.println("hello");
	}
	
	// 입력값 o, 리턴값 x
	void printName (String name) {
		System.out.println("안녕하세요, " + name + "님!");
	}
	
	// 입력값 x, 리턴값 o
	int getHundred() {
		System.out.println("100 리턴해줄게~");
		return 100;
	}
		
	// 입력값 o, 리턴값 o
	int sum (int a, int b) {
		int res = a + b; 
		return res;
		
	}

}

public class ClassEx10 {	
	public static void main(String[] args) {
		// 1) 입력값 x, 리턴값 x
		Test3 t = new Test3();
		t.test();
		// 2) 입력값 x, 리턴값 x
		t.printName("피카츄");
		t.printName("윤혜선");
		t.printName("아순에몽");
		// 3) 입력값 x, 리턴값 o
		int result = t.getHundred();
		System.out.println(result);
		// 4) 입력값 o, 리턴값 o
		int res = t.sum(100, 200);
		System.out.println(res);
		
		
	}

}
