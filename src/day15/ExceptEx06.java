package day15;

public class ExceptEx06 {
	public static void main(String[] args) {
/*
		try {
			
			throw new RuntimeException(); // 단독으로 써도 예외처리 잘 됨. 
			
		}catch (Exception e) {
			System.out.println("예외 발생");
			System.out.println(e);
		}
*/		
		
		try {
			System.out.println("hello");
			
			throw new  Exception("고의로 예외 발생~ " );
			
			// System.out.println("test"); 어차피 실행 안댐
	
		}catch (Exception e) {
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace(); // 예외 발생시 뜨는 메세지 다시 출력
		}
	}

}
