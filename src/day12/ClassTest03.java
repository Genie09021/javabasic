package day12;

import java.util.Scanner;

/*
Grade 클래스를 작성해보세요. 
3과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main()과 실행 예시는 아래와 같습니다. 
콘솔출력예 )
	수학, 과학, 영어점수를 입력하세요. 
	수학>> 90  (<- 임의로 사용자가 입력한 숫자)
	과학>> 88
	영어>> 96
	평균은 91
*/
class Grade {
	int math,sci,eng;
	double avg;
	
// 꼭 getter , setter를 다 쓸 필요는 없다.
	// 이 문제에선 getAvg 밖에 안나와있기 때문에 굳이 getter,setter를 쓸 필요는 없다.
	public int getMath () {return math;}
	public void setMath(int math) {this.math = math;}
		
	
	public int getSci () {return sci;}
	public void setSci(int sci) {this.sci = sci;}
	
	public int getEng () {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	
	public double getAvg () {return avg = ((double)math + sci + eng)/3.0;}
	public void setAvg(double avg) {this.avg = avg;}

	
}



public class ClassTest03 {
	public static void main(String[] args) {
		
		Grade grade = new Grade ();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 점수를 입력하세요.");
		
		System.out.print("수학>>");
		int math = Integer.parseInt(sc.nextLine());
		grade.setMath(math);
		
		System.out.print("과학>>");
		int sci = Integer.parseInt(sc.nextLine());
		grade.setSci(sci);
		
		System.out.print("영어>>");
		int eng = Integer.parseInt(sc.nextLine());
		grade.setEng(eng);
		
		System.out.printf("평균은 "+ "%.2f",grade.getAvg());
		
		sc.close();
		
	}
}
