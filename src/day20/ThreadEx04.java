package day20;
// Thread 상속
class ThEx01 extends Thread {
	@Override
	public void run() {
		for(int i =0; i< 5; i++) {
			System.out.println(getName());
		}
		System.out.println("th1 종료");
	}
}
// Runnable 구현
class ThEx02 implements Runnable {
	@Override
	public void run() {
		for (int i =0; i <5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("th2 종료");
	}
}

public class ThreadEx04 {
	public static void main(String[] args) {
		ThEx01 t1 = new ThEx01(); // Thread 상속 받음
		Runnable r = new ThEx02(); // Runnable 
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		System.out.println("메인 종료");
		// 총 움직이는 스레드 개수 t1,t2, main, 가비지 컬렉터까지 총 4개
		
		
		
		
		
	}

}
