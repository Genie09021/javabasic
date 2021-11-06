package day11;
//title, author를 저장할 수 있는 Book3 클래스를 만들고,
// 3개짜리 Book3 객체 배열을 만들어
// 사용자로부터의 책의 제목과 저자를 입력받아 배열을 완성하고 출력해보세요.
import java.util.Scanner;

class Book3 {
	String title;
	String author;
	// 생성자
	Book3(String title,String author) {
		this.title = title;
		this.author = author;
		System.out.println("생성자 호출");
	}

	void info () {
		System.out.println("제목 : " + title + " 저자 : "+ author);
	}

}
public class ClassEx39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Book3 [] books = new Book3 [3];
		
		for(int i=0; i<books.length; i++) {
			System.out.println("책 제목>>");
		    String title = sc.nextLine();
		    System.out.println("책 저자>>");
		    String author = sc.nextLine();
		    books[i] = new Book3(title, author);
		     
		}
		for (int i = 0; i<books.length; i++) {
			books[i].info();
		}
	
	}

}
