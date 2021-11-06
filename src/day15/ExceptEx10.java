package day15;

public class ExceptEx10 {
	public static void main(String[] args) {
		try {
			method1(); // method1이 예외 토스 받았을땐 try/catch를 써도되고 throws Exception을 써도됨
		} catch (Exception e) {
			System.out.println("main에서 예외처리함");
			e.printStackTrace();
		}	
	}
	
	static void method1 () throws Exception {
		try {
			throw new Exception ();
		}catch (Exception e) {
			System.out.println("method1에서 예외처리함~~");
			throw e;
		}
	}

}
