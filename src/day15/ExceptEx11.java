package day15;
// 사용자 정의 
class SpaceException extends Exception {
	SpaceException  (String msg) {
		super(msg);
	}
}
class MemoryException extends Exception {
	MemoryException (String msg) {
		super(msg);
	}
}
public class ExceptEx11 {
	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles ();
		}catch (SpaceException e) {
			System.out.println("에러메세지 :" + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후 다시 설치하시기 바랍니다.");
		}catch (MemoryException e) {
			System.out.println("에러메세지 :" + e.getMessage());
			e.printStackTrace();
			System.out.println("메모리 부족, 다른 프로그램 종료하시고 다시 시도해주세요.");
		}finally {
			deleteTempFiles ();
		}
	}
	static void startInstall () throws SpaceException, MemoryException {
		if (!enoughSpace ()) {
			throw new SpaceException("설치공간이 부족합니다");
		}
		if (!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	static boolean enoughSpace () {
		return true; // true ; 공간 충분
	}
	static boolean enoughMemory () {
		return false; // true : 메모리 충분
	}	
	static void copyFiles () {}
	static void deleteTempFiles () {System.out.println();}
	
}
