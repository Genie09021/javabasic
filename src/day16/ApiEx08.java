package day16;

public class ApiEx08 {
	public static void main(String[] args) {

		String s = new String("hello");
		System.out.println("s : " + System.identityHashCode(s));
		
		String t = s;
		System.out.println("t : " + System.identityHashCode(t)); // 주소 공유
		
		//t = s.concat("Java");
		//System.out.println("s : " + System.identityHashCode(s));
		//System.out.println("t : " + System.identityHashCode(t));
		
		
		s= s.concat("spring"); // 스트링 객체는 수정 불가능 , 아예 새로운 객체를 만들어 준다.
		System.out.println("s : " + System.identityHashCode(s));
		System.out.println("t : " + System.identityHashCode(t));
		System.out.println(s);
		System.out.println(t);
	}

}
