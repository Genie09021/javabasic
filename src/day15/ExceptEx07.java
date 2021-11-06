package day15;

public class ExceptEx07 {
	public static void main(String[] args) {
	
		try {
			System.out.println("try 구문");
			//throw new Exception ("hello");
			throw new RuntimeException ();
		}catch (NullPointerException e) {
			System.out.println("Null");
		}catch (Exception e) {
			System.out.println("모든 예외");
		}
		
	}

}
