package day09;

class Test156 {
	static String str = "hello";
	String ex = "hi";
}
class ClassEx077 {
	int num = 100;
}
class Hyeseon {
	String study = "class number";
}

class Family {
	int num = 4;
}
public class day09pr {
	
		//static int y = 20; // 클래스 변수 -> 클래스명.변수명
		//int x = 10;	//인스턴스 변수 : 객체생성 -> 참조변수명.변수명
			
		//Test2 t = new Test2();	// 인스턴스 : 객체생성 -> 참조변수명.변수명
		//static Test2 t = new Test2();	// 클래스변수 : 클래스명.변수명

	public static void main(String[] args) {
		
		//클래스명.클래스변수명		
		//참조변수명.클래스변수명
		
		//객체생성 후 참조변수명.인스턴스변수명
		
		Test156 Ts = new Test156();
		System.out.println(Ts.ex);
		
		System.out.println(Test156.str);
		
		ClassEx077 cls = new ClassEx077();
		System.out.println(cls.num);
		
		
		Hyeseon yun = new Hyeseon();
		System.out.println(yun.study);
		
		Family fam = new Family();
		System.out.println(fam.num);
		//ClassEx07 cls = new ClassEx07();
		//System.out.println(cls.x);
				
		//System.out.println(ClassEx07.y);
		
	}

}
