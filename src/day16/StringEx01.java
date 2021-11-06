package day16;

public class StringEx01 {
	
	static String s;		// null
	static String s2 = "";	// " "
	
	
	
	public static void main(String[] args) {
		/*
		String java = "Java";
		String cpp = "C++";
		//if (java.equals(cpp));
		
		int a = cpp.compareTo(java);
		if (a ==0 ) System.out.println("same");
		else if (a <0) System.out.println(cpp + " -> " +java);
		else System.out.println(java + "->" + cpp);
		 */
		/*
		//문자열 연결
		System.out.println("abcd" + 1 + true + 2.13e-2 + 'E' +"fgh");
		// 								2.13 e -2 (소수점을 앞으로 두번 ) e+2 (소수점을 뒤로 두번)
		// 객체와 연결
		System.out.println(new StringEx01() + "입니다"); // toString이 나옴
		
		//concat()
		System.out.println("I Like".concat("Java"));
		*/
		/*
		String a = "                             abcd                 edf     ";
		String b = "                        xyz\t                    ";
		
		System.out.println(a);
		System.out.println(b);
		
		String c = b.trim();
		System.out.println(c);
		
		*/
		/*
		String a = "class";
	
		char c = a.charAt(2);
		System.out.println(c);
		
		int count = 0;
		for (int i =0; i<a.length(); i++) {
			if (a.charAt(i) == 's') count++;
		} 
		System.out.println(count);
		*/
		/*
		String str = "Apple Tree";
		str = str.replace("Apple", "Lemon");
		System.out.println(str);
		
		String a = str.substring(4);
		System.out.println(a);
		
		String b = str.substring(3, 7);
		System.out.println(b);
		
		String c = str.toLowerCase();
		System.out.println(c);
		String d = str.toUpperCase();
		System.out.println(d);
		
		
		String [] ss = str.split("e");
		for (String s : ss) System.out.println(s);
		System.out.println(ss.length);
		*/
		
		
		for (int i = 1; i<10; i++) {
			s += i;
			s2 += i;
		}
		System.out.println(s);
		System.out.println(s2);
		
		
		
		
		
		
	}

}
