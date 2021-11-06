package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class IterEx02 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(2,200);
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int n = it.next(); // 만약 위에 <Integer> 라는 제네릭 타입이 없으면, 형변환 해줘야함. int n = (Integer) it.next();
			System.out.println(n);
		}
		
		//모든 정수를 더한 합 -> 반복자 사용
		int tot = 0;
		it = list.iterator(); // 반복자 다시 얻어서 사용. 반복자는 일회성이라서 두번못씀
		while (it.hasNext()) {
			tot += it.next(); //int n = it.next(); , tot += n;
			
		}
		System.out.println("총합 : " + tot); 
	}
}
