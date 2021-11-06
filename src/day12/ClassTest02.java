package day12;
/*
	main메서드를 실행하였을 때 예시와 같이 출력되도록 Tv 클래스를 작성하세요. 
	콘솔 출력예 >> Samsung에서 만든 2021년형 32인치 TV
*/
class Tv {
	String brand = "";
	int year;
	int inch;
	
	Tv (String brand, int year, int inch) {
		System.out.println("Tv info : ");
		this.brand = brand;
		this.inch = inch;
		this.year = year;
	}	
	void show () {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV" );
	}

	
	
}

public class ClassTest02 {
	public static void main(String[] args) {
		// main메서드는 작성 끝인 상태 실행하면 콘솔 예시 처럼 출력되어야함. 
		//Tv myTv = new Tv("Samsung", 2021, 32);
		//myTv.show();
		Tv myTv = new Tv("Samsung", 2021, 32);
		myTv.show();		
		
	}
}
