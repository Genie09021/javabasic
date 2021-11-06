package day09;

class Test2 {
	
	static int a = 10;
	int b = 20;
	
}

public class ClassEx07 {
	
	//static int y = 20; // 클래스 변수 -> 클래스명.변수명
	//int x = 10;	//인스턴스 변수 : 객체생성 -> 참조변수명.변수명
		
	//Test2 t = new Test2();	// 인스턴스 : 객체생성 -> 참조변수명.변수명
	static Test2 t = new Test2();	// 클래스변수 : 클래스명.변수명
	
	public static void main(String[] args) {

		//ClassEx07 cls = new ClassEx07();
		//System.out.println(cls.x);
		
		//System.out.println(ClassEx07.y);
		
		//ClassEx07 cls = new ClassEx07();
		//System.out.println(cls.t);
		
		System.out.println(ClassEx07.t);
		System.out.println(ClassEx07.t.b); // 참조형
		
	
	}

}
