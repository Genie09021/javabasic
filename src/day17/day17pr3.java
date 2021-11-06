package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class day17pr3 {

	public static void main(String[] args) {
		// 제네릭 타입 지정 없이!!
		ArrayList arr = new ArrayList();
		arr.add("Hye Seon");
		arr.add("Miss JamGu");
		System.out.println(arr);
		for (int i = 0; i< arr.size(); i++) {
			Object obj = arr.get(i);
			String str = (String)obj;
			System.out.println(str.toUpperCase());
		}
		for ( Object o : arr ) {
			String str = (String) o;
			System.out.println(str.toLowerCase());
		}
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Yun Jae");
		arr2.add("Loves Me");
		System.out.println(arr2);
		for (int i = 0; i< arr2.size(); i++) {
			String str = arr2.get(i);
			System.out.println(str.toUpperCase());
		}
		for ( String s : arr2) {
			System.out.println(s.toLowerCase());
		}
		
		// 이름 입력 받기 -> 저장하고 출력 -> 제일 짧은 이름 출력 
		ArrayList<String> array = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<4; i++ ) {
			System.out.println("Enter you name >> ");
			String name = sc.nextLine();
			array.add(name);
		}
		for (int i = 0; i< array.size(); i++) {
			String s = array.get(i);
			System.out.println("name : " + s);
		}
		System.out.println();
		
		// 가장 짧은 이름 골라냉
		int min = 0;
		for (int i = 0; i< array.size(); i++) {
			if (array.get(min).length()>array.get(i).length()) {
				min = i;
			}
		}
		System.out.println("가장 짧은 이름은 " + array.get(min));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
