package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayEx05 {
	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		list2.add(100000);
		System.out.println(list1.containsAll(list2));
		
		System.out.println("--------------------------");
		
		// retainAll은 list1에서 list2와 같은 요소를 제외한 나머지 삭제 (교집합)
		System.out.println(list1.retainAll(list2));  
		System.out.println(list1); // [0,2,4]
		System.out.println(list2);// [4,2,0,100000]
		
		List a = new ArrayList();
		a = new Vector();
				
	
	}

}
