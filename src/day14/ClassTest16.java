package day14;

import java.util.Scanner;

//인터페이스
/*
	Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하세요. 
	아래와 같은 실행결과가 나오도록 main()을 참고하여 작성하세요. 
	실행결과:
		총 스택 저장 공간의 크기 입력 >>  3 (사용자가 입력)
		문자열 입력 >> hello
		문자열 입력 >> sunny
		문자열 입력 >> smile
		문자열 입력 >> happy
		스택이 꽉 차서 푸시 불가!
		문자열 입력 >> 그만
		스택에 저장된 모든 문자열 팝 : smile sunny hello
*/
interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱(top)에 저장된 문자열 리턴하고 저장소에서 문자열 삭제

	boolean push(String val); // 스택의 톱(top)에 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
}

class StringStack implements Stack {
	private String[] data; // 입력받는 문자열 저장 공간, 스택

	private int num; // 저장 가능한 개수
	private int set; // 저장 인덱스
	private String[] stack;

	public StringStack() {
		this.num = num;
		this.set = 0;
		stack = new String[num];
	}

	public int length() { // 현재 저장된 데이터 개수
		return set;
	}

	public int capacity() { // 총 저장 가능한 공간 크기 == 배열의 길이
		return stack.length;
	}

	public String pop() { // 현재 마지막에 저장된 데이터 꺼내서 리턴,
		if (set - 1 < 0) // stack에 아무것도 넣지 않았을 떄
			return null;
		set--; // stack 한칸을 내려줌 (stack[set]은 빈공간을 가리키고 있으니깐)
		String s = stack[set]; // 맨 위의 값
		return s;
	}

	public boolean push(String val) { // 현재 저장된거 뒤에다 저장
		// 저장하고 결과 길턴
		boolean result = false;
		int len = length(); // 현재저장된 개수
		int size = capacity (); // 총 저장공간
		if (size - len > 0) data [len] = val; // 남은 공간이 있으면 저장하고 true 리턴
		else result = false; // 남은 공간이 없으면 저장안하고 false리턴 
		return result;
		/*
			if (set < num) {
			stack[set] = val; // 맨 위에 문자열을 넣어줌
			set++; // stack 한칸을 올려줌
			return true;
		} else
			return false;
			*/
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int num = sc.nextInt();
		data = new String[num];
		StringStack stack = new StringStack();
		while (true) {
			System.out.print("문자열 입력 >> ");
			String val = sc.next();
			if (val.equals("그만"))
				// 스택에 저장된 모든 문자열 팝 : smile sunny hello 출력
				break;
			if (!stack.push(val)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = stack.length();
		for (int i = 0; i < len; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
		sc.close();
	}
}

public class ClassTest16 {
	public static void main(String[] args) {
		StringStack s = new StringStack();
		s.run(); // 프로그램 구동 시작
	}
}
