package day15;

public class ExceptEx08 {
	/* 정석으로 예외처리하는 방법
	static void add () {
		try {
			Exception e = new Exception ();
			throw e; // Unhandled exception -> try catch 구문 써라 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	static void add () throws Exception { // 메서드 안에서 예외가 발생하면, 메서드를 호출한 쪽으로 예외처리 미루기.
		Exception e = new Exception ();
		throw e;
	}
	
	public static void main(String[] args) {

		try {
			add();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}

}
