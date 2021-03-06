package day17;

import java.util.ArrayList;

public class ArrayEx01 {
	public static void main(String[] args) {

		// #1. ArrayList 생성
		ArrayList<Integer> arr = new ArrayList<Integer> ();
		// ArrayList<Integer> arr2 = new ArrayList<Integer> (20);		
		
		// #2. 요소 추가
		arr.add(new Integer(10));
		arr.add(new Integer(20));
		arr.add(new Integer(-100));
		
		arr.add(1); // 자동 박싱  = new Integer(1)
		arr.add(2);
		arr.add(3);
		
		arr.add(null);// null 삽입 가능함에 주의
		
		System.out.println(arr);
		
		arr.add(2, 10000); // 중간에 추가됨 add(index, 요소)
		
		System.out.println(arr);
		
		// #3. 요소 꺼내기
		Integer a = arr.get(0); // Integer = int로도 가능 
		System.out.println(a);
		
		// #4. 크기와 
		System.out.println("저장된 데이터의 수 : " + arr.size());
	
		// #5. 삭제
		arr.remove(2); // remover(index)
		System.out.println(arr);
		// 아래처럼 값을 바로 쓰면 에러남
		//arr.remove(10);
		arr.remove(new Integer(10)); // remove(요소) 요소는 객체
		System.out.println(arr);
		
		System.out.println(arr.contains(20));
		
		System.out.println(arr.contains(null));
		
		
		
		
		
		
		
		
	}

}
