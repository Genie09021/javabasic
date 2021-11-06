package day13;
// 오버라이딩 다형성 실현 -> 링크드 리스트 구현

class Shape {// next, draw()
	public Shape next;
	public Shape () {next = null; }
	public void  draw () {
		System.out.println("shape");
	}
}
class Line extends Shape { // next, @draw("Line")
	@Override
	public void draw () {
		System.out.println("Line");
	}
}
class Rect extends Shape { // next, @draw("Rect")
	@Override
	public void draw () {
		System.out.println("Rect");
	}
}
class Circle extends Shape { // next, @draw("Circle")
	@Override
	public void draw () {
		System.out.println("Circle");
	}
}

public class PolyEx05 {
	public static void main(String[] args) {
		/*
		Line line = new Line();
		paint(line); 
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		 */
		
		Shape start, last, obj;
		
		start = new Line();
		last = start;
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new Circle();
		last.next = obj;
		last = obj;
		
		// 모든 도형 출력
		Shape s = start;
		while (s != null) {
			s.draw();
			s=s.next;
		}
		
		
		
		
	}
}
