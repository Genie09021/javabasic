package day12;

import java.util.Scanner; // Scanner를 사용하기 위해서 import를 통해 외부 클래스를 호출. Scanner는 java.util패키지에 포함되어있따.

class TicTacToe { // TicTacToe라는 클래스를 만들어어
	// final 필드는 초기값이 저장되면 이것이 최종적인 값이 됨. 프로그램 실행도중 수정할 수 없음. 
	// NUM_BOARD 는 10으로 항상 고정된 값을 가져 필드 선언시 초기값으로 10을 줌.
	final int NUM_BOARD = 10; 
	//String 타입의 theBoard라는 변수이름으로 배열 선언 = NUM_BOARD만큼의 String 타입의 공간생성.
	String [] theBoard = new String[NUM_BOARD];
	// Scanner sc = new Scanner(System.in) 12번째줄,17번째줄 합친고.
	// 클래스명 레퍼런스변수명;
	Scanner sc; 
	// String 타입의 playerLetter,computerLetter이라는 변수 생성
	String playerLetter;
	String computerLetter; 
	
	public TicTacToe() { // 기본생성자
		// 레퍼런스 변수명 = new 클래스명(); //Scanner 객체 생성, System.in은 입력한 값을 바이트 단위로 읽는다아
		sc = new Scanner(System.in); 
	}
	void boardReset() {
		// 반복문 사용, NUM_BOARD만큼 i를 반복한당.
		for(int i = 0; i < NUM_BOARD; i++) { 
			// theBoard라는 레퍼런스 변수[i라는 인덱스 번호] = 초기값 " ";
			theBoard[i] = " ";
		}
	}
	//입력값, 리턴값이 없는 메서드 void리턴타입의 setPlayerLetter 메서드명, 수행할 코드 String letter = "";
	// 나중에 호출할땐 setPlayerLetter();로 함.
	void setPlayerLetter() {
		//String 타입의 letter변수의 초기값 = "" , 리터럴 방식으로 초기값 넣어줌.
		String letter = " ";
		//반복문 while을 사용하여 (조건식 : x 또는 o 둘중에 하나 입력받기)
		// equals이용해서 letter이랑 "X", "O"랑 같은지 문자열 비교
		while(!(letter.equals("X") || letter.equals("O"))) { 
			System.out.print("X를 하고 싶나요, O를 하고 싶나요? >>");
			letter = sc.nextLine().toUpperCase();
		}//조건문 if를 이용해서 x 또는 o을 입력할때까지 무한반복해서 입력받음. 
		//조건식에 letter.equals("X")를 사용해서 x, o둘중에 하나를 꼭 서야 시작할 수 있게 함.
		//사용자가 x를 입력하면 playerLetter은 X를사용 computerLetter은 O를 사용.
		if(letter.equals("X")) { // x 선택
			playerLetter = "X";
			computerLetter = "O";
		// 사용자가 o를 입력하면 playerLetter은 o, computerLetter은 x를 사용	
		}else {// o 선택
			playerLetter = "O";
			computerLetter = "X";
		}
	}
	// 입력값은 없고 리턴값은 있는 String 타입의 whoGoesFirst 메서드명. 리턴타입이 void가 아니므로 return이 있어야함.
	// player순서가 내가 하는지 컴퓨터가 하는지 결정해줌 나중에 호출할땐 String turn = whoGoesFirst();로 함.
	String whoGoesFirst() { 
		//String 타입의 turn이라는 변수를 player로 저장.
		String turn = "player";
		// 조건문 if를 사용해서 (int)(math.random()*2) -> 0,1포함 : 따라서 0일땐 computer의 순서가 됨.
		if((int)(Math.random()*2) == 0) {
			turn = "computer";
		}
		//if문이 끝나면 turn으로 리턴해줌. 그럼 player순서가 됨.
		return turn; 
	}
	//입력값과 리턴값이 없는 void리턴타입의 drawBoard 메서드명 나중에 호출할땐 drawBoard();로 함.
	void drawBoard() {
		// theBoard는 NUM_BOARD [10]까지 만들어놓고 theBoard[0]은 사용 안함.
		// theBoard의 초기값은 ""으로 빈칸으로 놔뒀기 때문에 틀은 이렇게 만들어 놓으면 콘솔엔 처음 아무것도 안찍힌 상태로 나옴.
		System.out.println(" " + theBoard[7] + " | " + theBoard[8] + " | " + theBoard[9]);
		System.out.println("------------");
		System.out.println(" " + theBoard[4] + " | " + theBoard[5] + " | " + theBoard[6]);		
		System.out.println("------------");
		System.out.println(" " + theBoard[1] + " | " + theBoard[2] + " | " + theBoard[3]);		
	}
	//입력값(int move)도 있고 리턴값(true,false)도 있는 boolean 리턴타입의 isSpaceFree메서드명(int 타입의 move라는 파라미터명) 
	boolean isSpaceFree(int move) {
		//move 한 곳이 " "와 같으면 ture리턴, 같지 않으면 false리턴
		if(theBoard[move].equals(" ")) return true;
		else return false; 
	}
	//위에 isSpaceFree라는 메서드명과 같지만 매개변수의 타입과 개수가 다른 메서드로 중복작성한것-> 오버로딩함.
	//입력값(int move, String [] board)도 있고 리턴값(true, false)도 있는 boolean리턴타입의 isSpaceFree메서드명
	boolean isSpaceFree(int move, String[] board) { 
		// move번호에 따라 board[move]한 곳이 " "와 같고 && 0이 아니면 true리턴, 그렇지 않으면 false 리턴
		if(board[move].equals(" ") && move != 0) return true;
		else return false;
	}
	//입력값은 없고, 리턴값(Integer.parseInt(move))은 있는 int리턴타입의 getPlayerMove라는 메서드명
	int getPlayerMove() {
		//String 타입의 move라는 변수의 초기값은 = "0"
		String move = "0";
		// "0"을 포함 하고있으면 true 인데 앞에 !가 있으니까 0을 포함하고 있으면 false. true면 어디에 마크할까요??(1-9)질문에 답할 수 있음. 그리고 입력받은 숫자대로 움직임.
		// 1~9가 아니거나 0인경우에 while문 빠져나와서 1~9입력 받을 때까지 while문 반복.
		while(!"123456789".contains(move) || !isSpaceFree(Integer.parseInt(move)) ) { 
			// 일단 게임시작 하면 아래출력문처럼 출력 먼저 한번 하고 1~9번까지 입력받으면 
			// 0을 입력받으면 계속 끝나지않고 1~9숫자 입력받을 때까지 계속 출력.
			System.out.print("어디에 마크할까요?(1-9) >>");
			// 입력받은 숫자대로 표시
			move = sc.nextLine();
		}
		//1~9 입력받을 때까지 어디에 마크할까요? (1-9) 계속 표시됨.
		return Integer.parseInt(move);
	}
	// String 타입의 getBoardCopy 라는 배열 변수이름
	String[] getBoardCopy() {
		// String 타입의 copy라는 배열 변수이름 = [NUM_BOARD]만큼의 방개수 생성
		String [] copy = new String[NUM_BOARD];
		// NUM_BOARD만큼의 for문 반복
		for(int i = 0; i < NUM_BOARD; i++) {
			// copy[i]에 the Board[i]를 덮어 쓰기
			copy[i] = theBoard[i];
		}
		//for문이 끝나면 copy반복.
		return copy;
	}
	
	void makeMove(int move, String letter, String[] board) {
		board[move] = letter;
	}
	int chooseRandomMoveFromList(int [] idxs) {
		for(int i = 0; i < 20; i++) {		//임의로 20번 돌리기
			int randI = (int)(Math.random()*4);
			if(isSpaceFree(idxs[randI])) return idxs[randI];
		}
		return 0;
	}
	// 
	int getComputerMove() {
		String [] copy = null;
		// 컴퓨터수 시뮬레이션
		for(int i = 1; i < NUM_BOARD; i++) {
			copy = getBoardCopy();
			if(isSpaceFree(i, copy)) {
				makeMove(i, computerLetter, copy);
				if(isWinner(computerLetter, copy)) {
					return i;
				}
			}
		}
		//플레이어수 시뮬레이션
		for(int i = 1; i < NUM_BOARD; i++) {
			copy = getBoardCopy();
			if(isSpaceFree(i, copy)) {
				makeMove(i, playerLetter, copy);
				if(isWinner(playerLetter, copy)) {
					return i;
				}
			}
		}
		//  1,3,7,9중에 랜덤
		int move = chooseRandomMoveFromList(new int[] {1,3,7,9});
		if(move != 0) {
			return move;
		}
		// 가운데
		if(isSpaceFree(5)) return 5;
		
		//나머지중에 빈곳
		return chooseRandomMoveFromList(new int[] {2,4,6,8});
	}
	boolean isWinner(String letter, String [] bo) {
		boolean res = false;
		// 아래와 같이 한줄 입력이 완료 되면 승리.
		if((bo[7].equals(letter) && bo[8].equals(letter) && bo[9].equals(letter)) ||
			(bo[4].equals(letter) && bo[5].equals(letter) && bo[6].equals(letter)) ||
			(bo[1].equals(letter) && bo[2].equals(letter) && bo[3].equals(letter)) ||
			(bo[7].equals(letter) && bo[4].equals(letter) && bo[1].equals(letter)) ||
			(bo[8].equals(letter) && bo[5].equals(letter) && bo[2].equals(letter)) ||
			(bo[9].equals(letter) && bo[6].equals(letter) && bo[3].equals(letter)) ||
			(bo[7].equals(letter) && bo[5].equals(letter) && bo[3].equals(letter)) ||
			(bo[9].equals(letter) && bo[5].equals(letter) && bo[1].equals(letter))) { res = true; }
		return res;
	}
	boolean isBoardFull() {
		for(int i = 1; i < NUM_BOARD; i++) {
			if(isSpaceFree(i)) return false;
		}
		return true;
	}
	boolean playAgain() {
		System.out.print("게임을 다시 하시겠습니까?(y/n)");
		String res = sc.nextLine().toLowerCase();
		if(res.equals("y")) return true;
		return false;
	}
	void run() { // 프로그램 시작 
		// 게임 시작시 아래 문구 출력
		System.out.println("틱택토 게임!");
		// 끝나는 횟수가 정해져 있지 않은 반복문 while 사용
		while(true) {
			// boardReset, setPlayerLetter이라는 변수 생성
			boardReset();
			setPlayerLetter();
			// String 타입의 turn이라는 변수가 whoGoesFirst()라는 메서드 받아줌.
			String turn = whoGoesFirst();
			// whoGoesFirst에서 받는대로 player 또는computer가 실행됨. 그대로 문구 출력.
			System.out.println(turn + "가 먼저 시작하겠습니다.");
			
			boolean play = true;
			
			while(play) {
				int move = 0;
				if(turn.equals("player")) { // player의 차레라면 
					drawBoard();
					move = getPlayerMove();
					makeMove(move, playerLetter, theBoard);
					
					if(isWinner(playerLetter, theBoard)) {
						drawBoard();
						System.out.println("이겼다!!!");
						play  = false;
					}else {
						if(isBoardFull()) {
							drawBoard();
							System.out.println("비겼다...");
							break;
						}else {
							turn = "computer";
						}
					}
				}else {
					move = getComputerMove();
					makeMove(move, computerLetter, theBoard);
					
					if(isWinner(computerLetter, theBoard)) {
						drawBoard();
						System.out.println("졌다..컴퓨터 승리...");
						play = false;
					}else {
						if(isBoardFull()) {
							drawBoard();
							System.out.println("비겼네....");
							break;
						}else {
							turn = "player";
						}
					}
				}
			}//while(play)
			if(!playAgain()) {
				System.out.println("게임종료!!");
				break;
			}
		}// while(true)
	} // run
}// TicTacToe

public class Game {
	public static void main(String[] args) {
		// 메인 메서드에 TicTacToe 객체 생성 
		TicTacToe game = new TicTacToe();
		// run 메서드 실행 .
		game.run();
		
	}
}
