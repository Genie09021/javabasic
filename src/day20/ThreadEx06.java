package day20;

import javax.swing.JOptionPane;

class ThEx04 extends Thread {
	@Override
	public void run() {
		System.out.println("10초 안에 값을 입력해야 합니다.");
		String str = JOptionPane.showInputDialog("아무거나 입력하세여>>");
		ThreadEx06.inputCheck = true;
		System.out.println("입력하신 값은 : " + str + "입니다.");
		
		
	}
}



class ThEx05 extends Thread {
	@Override
	public void run() {
		for(int i =10; i >0; i--  ) {
			if (ThreadEx06.inputCheck) return;
			
			System.out.println(i);
			try {
				sleep(1000);
			}catch (Exception e) {
				
			}
		}
		System.out.println("10초 동안 값이 입력되지 않아 종료합니다.");
		// 돌아가는 프로그램을 종료시키고 싶으면 exit() 안에 숫자는 무의미한 값. 또는 interrupt 해도됨
		System.exit(0);
	}
}


public class ThreadEx06 {
	// static 변수를 사용하면서 공용변수가 됨.
	static boolean inputCheck = false;
	
	public static void main(String[] args) {

		ThEx04 inpuTh = new ThEx04 ();
		ThEx05 timeTh = new ThEx05();
		inpuTh.start();
		timeTh.start();
		
		
		
		
		
	}

}
