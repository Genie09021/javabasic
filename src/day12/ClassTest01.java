package day12;
import java.util.Scanner;
/*
	n명이 참가하는 끝말 잇기 게임을 만들어보자. 
	처음 단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면 된다. 
	끝말잇기에서 틀리면 게임오버 -> 진사람이름 출력, 종료
	WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성 .
	WordGameApp : 게임을 전체적으로 진행하는 run()메서드, run()에서 플레이어수만큼 Player객체 배열 생성
	Player : 플레이어 이름, 단어 입력받는 getWordFromUser()메서드, 끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 
	#tip:문자열 첫번째 문자 알아내는 방법은  .charAt(인덱스번호) 사용 
*/
class Player { // 참가인원 한명에 대한 정고 갖고 있음. 각 참가인원당 객체 생성
	private Scanner sc= new Scanner(System.in);
	private String name = "";
	private String inputWord = "";
	
	public void setName (String name) {this.name = name;}
	public String getName() {return name;}
	String getWordFromUser () { // 단어 입력받는
		System.out.println(name + " >> ");
		inputWord = sc.nextLine();
		return inputWord;
	}
	boolean checkSuccess (String lastWord) { // 끝말잇기 성공여부와 게임 계속할지 판별
		// 방금 내차례에 입력한 단어는 inputWord에 저장되었고, 
		// 이전 Player가 입력한 단어가 필요함
		// 두개 비교해서 결과 리턴
		boolean result = false;
		// 예 ) lastWord = "자동차" inputWord = "차고" 
		int lasIdx = lastWord.length()-1;	//2
		char lastChar = lastWord.charAt(lasIdx);// (자동)차
		char firstChar = inputWord.charAt(0);	// 차(고)
		if (lastChar == firstChar) {
			result = true;
		}
		return result;
	}

}
class WordGameApp {
	private Scanner sc;
	private Player [] p;
	private String startWord = "자동차";
	public WordGameApp () {
		sc = new Scanner(System.in);
	}
	
	void createPlayers() {
		System.out.println("참가인원수 입력 >>");
		int num = Integer.parseInt(sc.nextLine());
		p = new Player[num];
		for (int i = 0; i<num; i++) {
			p[i] = new Player();
			System.out.println("참가자 이름 입력>>");
			String n = sc.nextLine();
			p[i].setName(n); // = p[i].setName(sc.nextLine());
		}
	}
	
	
	void run() {
		System.out.println("끝말잇기 게임 시작!");
		// 참가 인원 입력받고, 이름도 입력받고
		createPlayers();
		// 시작단언 주고 게임시작
		System.out.println("시작단어는 " + startWord + "입니다.");
		String lastWord = startWord;
		// 게임 : 참가인원만큼 순서대로 입력, 확인
		int idx = 0;
		while (true) {
			// p 배열에 있는 객체 돌아가면 꺼내기 (인덱스 필여)
			// p[idx]꺼내서 단어입력받는것 시키기 getWordFromUser (); -> 입력받은 단어 받기
			String newWord = p[idx].getWordFromUser();
			//p [idx] 성공여부 메서드 checkSuccess()-> 입력받은 단어랑 이전단어 비교 -> 결과 돌려받기 
			boolean check = p[idx].checkSuccess(lastWord);
			// 성공 -> while 다시 돌기, 실패 -> while 문 끝내기 
			if (!check) { // true -> false, false -> true ==> 실패했다면 
				System.out.println("게임 오버!" + p[idx].getName() + "님이 졌습니다.");
				break;
			}
			idx ++;
			idx %= p.length;
			lastWord = newWord;
		}
	}
}
public class ClassTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// main 메서드는 아래 두줄로 작성 끝. 실행하면 게임시작되게 하기. 
		WordGameApp app = new WordGameApp();
		app.run();
	}
}
