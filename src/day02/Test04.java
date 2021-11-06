package day02;

public class Test04 {
	public static void main(String[] args) {
		
		
	
		//문자열 String (참조형) : 문자열 데이터는 무조건 쌍따옴표		
		String a = "안녕하세요";
		System.out.println(a);
		// 문자 한개 출력하는데 홑따옴표로 묶는다. 근데 아래에 여러개를 홑따옴표로 묶은이유는  \u0041 -> A의 유니코드이기 때문
		char ch = '\u0041';
		System.out.println(ch);
		
		//int : 10진수 / 8진수 : 0으로시작하는 수 / 16진수 : 0x로 시작 / 2진수 : 0b로 시작
		int i = 15;
		System.out.println(i);
		int j = 015;
		System.out.println(j);
		int k = 0x15;
		System.out.println(k);
		int l = 0b0101;
		System.out.println(l);
		
	
	}
	

}
