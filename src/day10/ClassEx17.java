package day10;

public class ClassEx17 {

	// 오버로딩
	static void add () {}
	static void add (int x) {System.out.println(x);}
	//static void add (int a ) {}
	static void add (long x) {System.out.println(x);}
	static void add (long a, int b) {System.out.println(a + " "+ b);}
	static void add (int a, long b) {System.out.println(a + " "+ b);}
	

	
	
	public static void main(String[] args) {

		add();
		add(100L);
		add(10, 10L); // 마지막꺼(int a, long b)
		
	}

}
