package day11;
// 캡슐화 활용
class Person1 {
	private int age = 10;
	public void setAge(int age) {
		if (age > 0 && age < 130) {
		this.age = age;
		}else {
			System.out.println("나이가 이상해요...");
		}
	}
	public int getAge () {
		return age;
	}
}




public class ClassEx42 {
	public static void main(String[] args) {

		Person1 p = new Person1 ();
		p.setAge(30);
		System.out.println("나이는 :" + p.getAge() + "살");
	
		
	}

}