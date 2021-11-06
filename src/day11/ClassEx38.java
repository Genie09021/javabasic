package day11;

class Car {
	// 생성자
	String color = "";
	// 매개변수 있는 생성자 => 기본생성자 자동생성x => new Car(); 기본생성자 호출하며 객체생성불가.
	// 객체 생성시 반드시 color 값을 주면서 생성해야됨.
	Car (String color) {
		this.color = color;
	}
	String drive() {
		return color + "색 차가 지나갑니다~ 비키세요~";
	}
}


public class ClassEx38 {

	public static void main(String[] args) {

		Car [] cars = new Car [5]; // 자동차 5개 저장할 수 있는 배열(주차장)
		String [] colors = {"빨간", "노란", "검정", "초록", "파란"};
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].color);
		}
		
		for (int i = 0; i<cars.length; i++) { // 자동차 개수만큼 반복해서
		cars[i] = new Car(colors[i]); // 자동차를 colors의 색들로 생성해서 주차장에 저장.
		}
		
		for (int i = 0; i< cars.length; i++) {
			System.out.println(cars[i].drive());
		}
	}

}
