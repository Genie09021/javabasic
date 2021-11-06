package day16;

import java.util.Scanner;

public class ApiEx07 {
	public static void main(String[] args) {

		String a = "hello";
		String b = "hello";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println();
		
		String c = new String ("hello");
		String d = new String ("hello");
		//System.out.println(c);
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		System.out.println();
	}

}
