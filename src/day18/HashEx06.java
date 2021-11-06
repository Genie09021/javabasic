package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashEx06 {
	public static void main(String[] args) {

		HashMap map = new HashMap ();
		map.put("hyeseon", new Integer(100));
		map.put("jenny", new Integer(80));
		map.put("minky", new Integer(90));
		map.put("jam", new Integer(100));
		
		// Set<Map.Entry<K<V>> entrySet() : 맵네에 보관 유지되고 있는 매핑의 세트뷰 반환
		// Map.Entry : 맵의 엔트리 (키 벨류 쌍쌍바).
		// Map.entrySet 이 클래스에 속하는 요소를 가지는 맵의 코레크션뷰를 돌려줍니다.
		Set set = map.entrySet();//혜선 = 100, 
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue() );
		}
		
		
		
		
	}

}
