package day18;

import java.util.Iterator;
import java.util.Vector;

public class IterEx01 {
	public static void main(String[] args) {
		// Iterator<E> 반복자 구조
		Vector<Integer> v = new Vector<Integer>();
		
		// 반복자를 이용해서 모든 데이터 접근
		Iterator<Integer>it =  v.iterator(); 
		
		while(it.hasNext()) { // 요소가 끝날때까지 반복 
			int n = it.next(); // 요소 꺼내기, 내려주고 값 리턴
			// ....
			
		}
	
	}

}
