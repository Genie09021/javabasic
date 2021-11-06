package day15;

public class ExceptEx05 {
	public static void main(String[] args) {

		System.out.println(1);
		try {
			System.out.println(2);
			//System.out.println(0/0); // 예외발생 -> 바로 catch로 건너뜀. 3번 안찍힘
			System.out.println(3);
		}catch (Exception e) {
			System.out.println(4);
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		
		
		
		
	}

}
