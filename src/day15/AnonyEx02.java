package day15;

import java.nio.file.WatchKey;

class Person {
	void wake () {
		System.out.println("7시에 기상");
	}
}

class Anony {
	//초기값으로 대입 : Person 객체 상속 받은 자식 클래스를 정의(오버라이딩)함과 동시에, 생성해서 대입.
	Person p = new Person() { 
		void work () {
			System.out.println("출근~~");
		}
		@Override
		void wake() {
			System.out.println("6시에 기상");
			work ();
		}
	};
	// Anony의 인스턴스 메서드
	void func () {
		//지역변수 값으로 대입
		Person localP = new Person() {
			void walk () {
				System.out.println("산책~~");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어나서~~");
				walk();
			}
		};
		//localP는 지역변수 이므로 이 메서드 안에서만 유효
		localP.wake();
	}
	void func2 (Person person) {
		person.wake();
		
	}
	
}


public class AnonyEx02 {
	public static void main(String[] args) {

		Person p = new Person();
		p.wake();
		
		Anony anony = new Anony();
		anony.p.wake();
		// p.work가 안되는 이유는 Person이라는 클래스에 wake 밖에 없기 때문에.
		anony.func();
		
		anony.func2(new Person() {
			void study () {
				System.out.println("공부한닷");
			}
			@Override
			void wake () {
				System.out.println("9시에 기상");
			}
		});
	
	}

}
