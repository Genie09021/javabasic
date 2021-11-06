package day15;

public class ExceptEx09 {


	
	
	public static void main(String[] args) {
		try {
		method1 ();	
		}catch (Exception e) {
			System.out.println("예외처리");
			e.printStackTrace();
		}
		
	}

	static void method1 () throws Exception {
		method2 ();
	}
	static void method2() throws Exception {
		throw new Exception();
	}
	
}
