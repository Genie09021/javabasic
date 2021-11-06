package day17;

import java.util.Vector;

class Point {
	private int x, y;
	public Point (int x, int y) {
		this.x = x; this.y = y;
	}

	public String toString () {
		return "(" + x+ "," + y+ ")";
	}

}	
public class VecEx02 {
	public static void main(String[] args) {
		/*
		Vector<String> v = new Vector<String> ();
		
		v.add("hello");
		v.add("10");
		*/
	// Point 객체만 저장할 벡터를 생성
		Vector<Point> v = new Vector<Point>();
		
		// 요소 삽입
		v.add(new Point(2,3));
		v.add(new Point(10,30));
		v.add(new Point(-100,-200));
		
		System.out.println(v);
		
		v.remove(1);
		/*
		// Vector안의 point객체 모두 검색
		for (int i = 0; i< v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		*/
			printVector(v);
	}
	
	public static void printVector(Vector<Point> v) {
		for (int i = 0; i< v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}
	
	

}
