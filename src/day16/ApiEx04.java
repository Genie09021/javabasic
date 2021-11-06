package day16;

public class ApiEx04 {

	public static void main(String[] args) {

		String a = new String ("Hello");
		String b = new String("Hello");

		if (a==b) System.out.println("a==b"); // ==은 주소비교 그래서 주소는 달라서 a==b는 출력안댐
		if (a.equals(b)) System.out.println("a equals b"); // 
		
		//
		String s1 = "abc";
		String s2 = "abc";
		if (s1 ==s2) {
			System.out.println("s1 == s2");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}
		
		
		
	}

}
