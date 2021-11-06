package practice;

import java.util.Scanner;

public class prEx03 {

	public static void main(String[] args) {
		// 문제 2-1. 게임랭킹보드. 5개의 데이터를 저장할 수 있는 users와 scores라는 이름의 배열이 있고,
				// users 배열에는 유저네임, scores 배열에는 게임점수를 입력받아 저장한다.
				// 단 , 유저네임과 게임점수는 배열 인덱스상 서로 일치한다.
				// ex) uses첫번째방 유저의 점수는 scores첫번째방에 저장
				
				//방 5개 짜리 users 배열 만들기 : 이름저장 : 문자열 String[]
				//방 5개 짜리 scores 배열 만들기 : 게임 점수 저당 : 숫자 int[]
		
		String [] users = new String [5];
		int [] scores = new int [5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i< users.length; i++) {
			System.out.println("유저네임을 입력해 주세요>>");
			users[i] = sc.nextLine();
			System.out.println("점수를 입력해 주세요>>");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
		for (int i = 0; i<users.length; i++) {
			System.out.println(users[i] +  scores[i]);
		}
		
		
		// 문제 2-2. 위 저장된 users와 scores를 아래와 같은 형태로 출력.
				//콘솔출력 ex) 
				/* user_name		score
				 ---------------------------
				 	피카츄			87
				 	파이리			24
				 	....
				*/
		
		System.out.println("user_name" + "\t" + "score");
		System.out.println("---------------------------");
		for (int i = 0; i< users.length; i++) {
			System.out.println(users[i] + "\t" + "\t"+ scores[i]);
		}
		
		// 문제 2-3. 두번째 유저[1]의 점수와 세번째 유저[2]의 점수가 서로 바뀌어서 저장이 되었다합니다. 두개의 점수만 교환해주세요.
		
		for (int i = 0; i< scores.length; i++) {
			int temp = scores[1];
			scores[1] = scores[2];
			scores[2] = temp;
		}
		for (int i = 0; i<scores.length; i++) {
			System.out.println(users[i] + scores[i]);
		}
		// 문제 2-4. 점수가 높은 순으로 출력되는 게임 랭킹보드를 출력하세요. 랭킹보드는 1~5위까지
		//콘솔출력 ex)
		/* rank		user_name	score
		---------------------------------
			1		꼬북이		137
			2		피카츄		87
			3		..............	
		*/
		
		for (int i = 0; i< scores.length-1; i++) {
			for (int j = i +1 ; j<scores.length; j++) {
				if ( scores[i] < scores[j]) {
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tmp = users[i];
					users[i] = users[j];
					users[j] = tmp;
				}
			}
		}
		
		System.out.println("rank " + "\t" +"    user_name" + "\t" + "     score");
		System.out.println("------------------------------------------");
		for (int i = 0; i < users.length; i++) {
				System.out.println((i+1) + "\t\t" +users[i] +"\t\t" +  scores[i]);
				
			
		}
		

		// 문제 2-5. 또 한명의 유저가 게임을 끝냈습니다. 점수와 유저네임을 입력받고, 기존의 게임랭킹보드를 업데이트해 출력하세요.
			//이때 입력받은 새로운 유저의 데이터는 기존의 데이터에 추가 되어야 함 (1-3문제 참고)
			// 업데이트 방법 : 
			// 1) 랭킹은 5위까지만 출력. 새로 입력받은 유저의 점수가 5위보다 낮으면 출력 X,
			// 순위권 안에 들어오는 점수면 순위에 맞춰 출력.
			String [] temp1 = users;
			int [] temp2 = scores;
			// 배열의 방 크기를 키우는데 먼저 기존 배열의 길이에 담기.
			int length = scores.length;
			// 각각 scores랑 users의 기존 배열 방 크기 5개에서 6개로 만들어 주기 
			users = new String [length +1];
			scores = new int [length +1];
			// temp1, temp2에 복사해둔 기존 데이터 옮겨 담기.
			for (int i = 0; i < temp2.length; i++) {
				scores[i] = temp2[i];
				users[i] = temp1[i];
				
			}
			System.out.println("유저네임을 입력해 주세요>>");
			users[length] = sc.nextLine();
			System.out.println("점수를 입력해 주세요>>");
			scores[length] = sc.nextInt();
			// 다시 정렬 하기
			for (int i = 0; i< scores.length; i++) {
				for (int j = i+1; j < scores.length; j++) {
					if (scores[i]< scores[j]) {
						int temp = scores[i];
						scores[i] = scores[j];
						scores[j] = temp;
						String tmp = users[i];
						users[i] = users[j];
						users[j] = tmp;
					}
				}
			}
			// 랭킹 출ㄹ력 
			System.out.println("rank " + "\t" +"    user_name" + "\t" + "     score");
			System.out.println("----------------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.println((i+1) + "\t\t" + users[i] + "\t\t" + scores[i]);
			}
		
	}

}
