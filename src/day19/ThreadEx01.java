package day19;
// 스레드 클래스 만들기
class TimeThread extends Thread {
	int n =0;
	// #2. run 메서드 오버라이딩 : 
	@Override
	public void run() {
		while (true) {
			System.out.println();
			n++;
			try {
				sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			
			
		}	// while
	}//run
} // class

public class ThreadEx01 {
	public static void main(String[] args) {
		
		// #3. 스레드 객체 생성
		TimeThread th = new TimeThread();
		// #4. 스레드 시작 
		th.start();
		
		
		
		
		
	}

}
