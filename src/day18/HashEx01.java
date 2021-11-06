package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashEx01 {
	public static void main(String[] args) {
			
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("apple", "사과");
		h.put("strawberry", "딸기");
		h.put("watermelon", "수박");
		h.put("peach", "복숭아");
		
		//System.out.println(h);
		String str = h.get("Apple");
		System.out.println(str);
		
		String str2 = h.get("melon");
		System.out.println(str2);
		
		String rem = h.remove("peach");
		// System.out.println(h);
		System.out.println(h.size());
		
		Set<String> keys = h.keySet(); // hashmap의 모든 키들만 꺼내옴
		Iterator<String> it = keys.iterator(); // 키들의 반복자 얻기 
		while (it.hasNext()) { // 키가 없을떄까지 반복해서 
			String key = it.next(); // 키 하나 꺼내짐 
			String value = h.get(key); // 꺼내진 key로 해시맵에서 value 꺼내기
			System.out.println("{"+key + ", " + value + "}");
		}

		
		
		
	}

}
