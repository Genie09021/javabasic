package day17;

import java.util.ArrayList;

public class day17pr2 {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(null);
		arr.add(10);
		arr.add(100);
		arr.add(75);
		
		arr.add(15);
		arr.add(4);
		arr.add(82);
		
		System.out.println(arr);
		
		arr.add(3, null);
		System.out.println(arr);
		
		Integer num = arr.get(0);
		System.out.println(num);
		int num2 = arr.get(6);
		System.out.println(num2);
		
		System.out.println("저장된 데이터의 수 : " + arr.size());
		
		arr.remove(num2);
		System.out.println(arr); // 6번째 배열 데이터 값 사라짐
		arr.remove(new Integer(82));
		System.out.println(arr); // 82라는 데이터 사라짐

		System.out.println(arr.contains(100));
		System.out.println(arr.contains(20));
		System.out.println(arr.contains(null));
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(10); arr2.add(40); arr2.add(80);
		arr2.add(2, 25); // 10 40 25 80 
		
		for (int i = 0; i< arr2.size(); i++) {
			int number = arr2.get(i); // arr2[i]
			System.out.println(number);
		}
		int sum = 0;
		for (int i = 0; i< arr2.size(); i++) {
			sum += arr2.get(i);
		}
		System.out.println(sum);
		
		
		
	}

}
