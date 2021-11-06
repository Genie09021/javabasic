package day17;

import java.util.ArrayList;

public class ArrayEx02 {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer> ();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(2, 100);
		
		// 모든 방에 접그내서 요소 꺼내 출력
		for (int i = 0; i < arr.size(); i++) {
			int n = arr.get(i);
			System.out.println(n);
		}
		
		// arrayList의 모든 정수를 다 더한 총합
		int sum = 0;
		for (int i = 0; i< arr.size(); i ++) { //배열에선 arr.length; 여기선 arr.size
	
			sum += arr.get(i); // arr[i];
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
