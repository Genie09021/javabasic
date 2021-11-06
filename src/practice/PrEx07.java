package practice;

public class PrEx07 {

	static void printCharArray(char[]a) {
		for (int i =0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}	
	static void replaceSpace(char [] b) {
		for (int i = 0;  i< b.length; i++) {
			if ( b[i] == ' ') {
				b[i] = ',';
			}
		}
	}
	
	
	public static void main(String[] args) {
		/* 
	 	char[] 배열을 전달받아 출력하는 printCharArray() 메서드와 배열속의 ''공백문자를, ','
	 	쉼표로 대치하는 replaceSpace() 메서드를 작성해보세요
	 */
		// static으로 두개 메서드 작성
		
		// static : 클래스 만들어주는 키워드
		// void : 리턴타입 없음. 돌려줄 값 없음. return키워드 안에 작성 x,
		// (char [] a) : 매개변수, 파라미터, 호출하는 시점에서 char[]을 인자로 줬으니 
		// 받아주는 매개변수도 같은 char[]으로 만들고, 이때 이름은 던져준 변수와 받는 변수가 같을 필요는 없다. 달라도 된다.
		// 매개변수, 인자는 서로 개수와 데이터 타입과 순서가 일치해야된다.
		// 밑에서 char[] 한개 던졌으니 받아주는애도 한개만 일치하게 작성 
		char []c = {'I', ' ', 'a', 'm', ' ', 'H','a','p','p','y'};
		
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		
	}

}
