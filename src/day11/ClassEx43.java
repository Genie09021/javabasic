package day11;

// Person3클래스 만들고
// 이름, 나이, 혈액형, 키, 주소, 전화번호, 주민번호에 해당하는 변수와 getter/setter 만들기

class Person3 {
	private String name;
	private int age;
	private String blood;
	private int height;
	private String address;
	private String phone;
	private String id;
	
	public String getName () {return name;}
	public void setName (String name) {this.name = name;}
	
	public int getAge () {return age;}
	public void setAge (int age) {
		if (age > 0 && age <120) {
		this.age = age;
		}else {
			System.out.println("나이를 잘못 입력하셨습니다");
		}
	}	

	public String getBlood () {return blood;}
	public void setBlood (String blood) {
		if (blood == "A" || blood == "B" || blood == "O" || blood == "AB") {
		this.blood = blood;
		} else {
			System.out.println("혈액형을 잘못 입력하셨습니다");
		}
	}	
	
	public int getHeight () {return height;}
	public void setHeight (int height) {this.height = height;}
	
	public String getAddress () {return address;}
	public void setAddress (String address) {this.address = address;}
	
	public String getPhone () {return phone;}
	public void setPhone (String phone) {this.phone = phone;}
	
	public String getId () {return id;}
	public void setId (String id) {this.id = id;}
	
	
}


public class ClassEx43 {

	public static void main(String[] args) {
		
		Person3 p = new Person3();
		
		p.setName("윤혜선");
		System.out.println("제 이름은 " + p.getName()+ " 입니다");
		
		p.setAge(100);
		System.out.println("제 나이는 " + p.getAge()+ " 입니다");
		
		p.setBlood("A");
		System.out.println("제 혈액형은 " + p.getBlood()+ " 입니다");
		
		p.setHeight(163);
		System.out.println("제 키는 " + p.getHeight()+" 입니다");
		
		p.setAddress("송파구");
		System.out.println("제 주소는 " + p.getAddress()+ " 입니다");
		
		p.setPhone("010-1234-5678");
		System.out.println("제 전화번호는 " + p.getPhone()+ " 입니다");
		
		p.setId("987654-2");
		System.out.println("제 주민번호는 " + p.getId()+" 입니다");
		
	}

}
