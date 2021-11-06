package day19;

class ThreadEx extends Thread {
	@Override
	public void run() {
		for (int i =0; i<100; i++) {
			System.out.println("run");			
		}
		/* 무한 반복에 빠지지 않게 주의.
		while (true) {
			System.out.println("");
		}
		*/
	}
}

public class ThreadEx02 {

	public static void main(String[] args) {

		ThreadEx th= new ThreadEx();
		ThreadEx th2= new ThreadEx();
		th.start(); // 멀티 스레드
		th2.start(); // 멀티 스레드
		//th.run(); // 싱글 스레드 일반 메서드 실행. 위에 for문 다하고 밑에 for문 돌리는거라 섞여있지 않음.
		for (int i =0; i<100; i++) {
			System.out.println("mmm");
		}
		System.out.println("main 종료!! ");
		
		
		
		
		
		
		
	}

}
