package day16;

public class WrapperEx03 {

	public static void main(String[] args) {

		// 문자열 -> 기본타입으로 변환
		/*
		int i = Integer.parseInt("123");
		System.out.println(i);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		Double d = Double.parseDouble("3.1415");
		System.out.println(d);
		*/
		// 기본타입 -> 문자열
		String s1 = Integer.toString(123); // Double, Float, Boolean, Byte .....
		System.out.println(s1);
		
		String s2 = Integer.toBinaryString(123);
		System.out.println(s2);
		
		String s11 = 123 + "";
		
		// 타입 알아보기 
		int x = 10;
		Object obj = x;
		System.out.println(obj.getClass());
		
		Integer i = new Integer(100);
		Integer ii = new Integer(100);
		
		System.out.println("i==ii : " + (i ==ii));
		System.out.println("i equals ii : " + (i.equals(ii)));
		
	}

}
