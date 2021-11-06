package day11;

public class ClassEx36 {
	
	int x = 10;
	String setPerson;
	//...
	//...
	//...
	

	void  setX(int x) { // 지역 변수 > 인스턴스 변수 ? 클래스변숟
		this.x =x; // this == 인스턴스 == 객체 
	}
	
	void setPerson (String name, String email, String mobile, String address, String gender, int number) {
		// 매개변수가 짱많
		
	}
	


	public static void main(String[] args) {

		ClassEx36 c1 = new ClassEx36(); // x =10
		ClassEx36 c2= new ClassEx36();// x =10
		ClassEx36 c3 = new ClassEx36();// x =10
		
		c1.setX(100);
		//c1.setPerson(null,null,null,null,null,null,null);
		
		
		//int x = 100;
		//System.out.println(x); //지역변수
		//System.out.println(c.x); // 인스턴스변수
		
		System.out.println(c1.x);
	}

}
