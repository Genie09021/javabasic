package day17;

import java.util.Vector;

public class VecEx01 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(100);
		v.add(1000);
		v.add(2, null);
		System.out.println(v);
		System.out.println(v.get(0));
		
		v.remove(new Integer(10)); // 객체 형식으로 던져줘야 됌. 그냥 v.remove(10); 이렇게 ㅎ하면 에러남 
		
		System.out.println(v.size());
		for (int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
	}

}
