package day17;

import java.util.ArrayList;

public class ArrayEx03 {

	public static void main(String[] args) {

		// 제네릭 타입 지정 없이 사용할때
		// 문자열을 저장하고, 문자열의 UpperCase기능으로 전체 대문자로 출력
		ArrayList arr = new ArrayList();
		arr.add("Apple");
		arr.add("Orange");
		System.out.println(arr);
		for(int i =0; i< arr.size(); i++) {
			Object obj = arr.get(i); // 제네릭타입을 지정안해줘서, Object로 리턴을 해줌. Apple, Orange로만 나옴. 
			String str = (String)obj;// String의 메서드를 사용하기 위해 String으로 형변환
			System.out.println(str.toUpperCase());
		}
		for (Object o : arr) {
			String str = (String)o;
			System.out.println(str.toLowerCase());
		}
		
		// 제네릭 타입 지정 O
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Apple");
		arr2.add("Orange");
		System.out.println(arr2);
		for(int i =0; i< arr2.size(); i++) {
			String str = arr2.get(i); 
			System.out.println(str.toUpperCase());
		}
		for (String s : arr2) {
			System.out.println(s.toLowerCase());
		}
		
		
	}

}
