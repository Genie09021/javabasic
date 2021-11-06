package day10;

class Circle {
	int radius = 30;
	
}
public class ClassEx12 {
	
		// 기본형 테스트용 메서드
		static void plus (int num) { // 객체생성 안하고 테스트해보기위해 그냥 static , 매개변수도 지역변수의 일종
			num = num +1;
			System.out.println("plus num : " + num);

		}

		// 참조형 테스트용 메서드
		static void biggerPizza(Circle pizza2) { // 매개변수는 타입, 갯수, 순서만 중요 이름은 안중요
			pizza2.radius++;
		}
		
		// 배열 테스트용 메서드
		static void increase (int [] array) {
			for (int i = 0; i<array.length; i++) {
				array[i]++;
			}
		} 	
	public static void main(String[] args) {
		
	// 기본형
		int num = 10;
		plus (num);
		System.out.println("main num : " + num);
		
	// 참조형
	Circle pizza = new Circle();
	System.out.println("main pizza radius before : "+pizza.radius);
	biggerPizza(pizza);	
	System.out.println("main pizza radius after : "+pizza.radius);	
		
	// 배열 (참조형)
	int arr [] = {1,2,3,4,5};
	increase(arr);	
	System.out.println("main : ");
	for (int a : arr) {System.out.println(a);}	
		
		
	}

}
