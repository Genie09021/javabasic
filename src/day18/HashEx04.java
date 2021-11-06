package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	id와 tel(전화번호)로 구성되는 Student 클래스를 만들고, 
	이름을 key로 하고 , Student객체를 값으로 하는 해쉬맵을 작성해보세요. 
	이름을 검색하면 id와 전화번호 출력되고, exit 입력하면 프로그램 종료.
*/
class Student {
	String id;
	String tel;
	public Student (String id, String tel) {this.id = id; this.tel = tel;}
	public String getId() {return id;}
	public String getTel() {return tel;}
}
public class HashEx04 {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("혜선", new Student("hyeseon", "01072311140"));
		map.put("혜정", new Student("hyejeong", "01099189107"));
		map.put("순우", new Student("soonwoo", "01027591964"));
			
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("이름을 입력하세요>>");
			String name = sc.next();
			if (name.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			Student student = map.get(name);
			if(student == null)
				System.out.println(name + "은(는) 없는 사람입니다.");
			else
				System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
		}
		sc.close();
	}
}


