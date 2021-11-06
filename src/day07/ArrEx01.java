package day07;

import java.util.Scanner;

public class ArrEx01 {
	public static void main(String[] args) {

		// 문제 1-1. arr이라는 이름의(방5개) 하나의 배열에 사용자로부터 
		//서로 다른 5개의 정수를 입력받아 저장해보고 출력.
		/*
		Scanner sc = new Scanner(System.in);
		
		int [] arr;
		arr = new int[5];
		System.out.println("서로 다른 정수 5개를 입력하세요>>");	
		
		for (int i  = 0; i < arr.length; i++) {			
			arr[i]= sc.nextInt();
				
		}
		for (int i  = 0; i < arr.length; i++) {
			System.out.println(arr[i] );	
		}
	*/
	// 문제 1-2. 위에서 만든 배열 arr에 저장된 값들을 오름차순으로 정렬하여 출력
		/*
		for (int i = 0; i< arr.length; i++) {
			for ( int j=0; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
			*/	
		/*
	// 문제 1-3. 정수 한개를 더 입력받아 저장하기.
		// 입력받은 정수는 기존 배열의 마지막 데이터 다음방에 저장되어야 한다. 
		//단, 배열은 문법적으로 방크기 수정이 불가하고, 데이터가 하나더 추가되려면 방이 6개여야 한다.
		//int [] arr = {1,2,3,4,5};
		// 정수 한개 입력
		System.out.println("새 정수 입력 :");
		int newNum = sc.nextInt();
		//방을 6개로 반들어서 마지막꺼 추가
		//arr을 잠시 복사를 해두고 -> 주소값 복사(레퍼런스 공유)
		int [] temp = arr;
		//arr 을 다시 방 6개로 할당해주고
		arr = new int[6];
		for (int i = 0; i<temp.length; i++) {
			arr[i] = temp[i];
		}
		 // 새로 입력받은 숫자를 마지막 방에 저장
		arr[5] = newNum;
		
		System.out.println("결과출력");
		for ( int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
	// 문제 2-1. 게임랭킹보드. 5개의 데이터를 저장할 수 있는 users와 scores라는 이름의 배열이 있고,
		// users 배열에는 유저네임, scores 배열에는 게임점수를 입력받아 저장한다.
		// 단 , 유저네임과 게임점수는 배열 인덱스상 서로 일치한다.
		// ex) uses첫번째방 유저의 점수는 scores첫번째방에 저장
		
		//방 5개 짜리 users 배열 만들기 : 이름저장 : 문자열 String[]
		//방 5개 짜리 scores 배열 만들기 : 게임 점수 저당 : 숫자 int[]

		Scanner sc = new Scanner(System.in);
		
		// 방5개짜리 users 배열 만들기 : 이름저장 : 문자열 String[] 
	      String[] users = new String[5];
	      // 방5개짜리 scores 배열 만들기 : 게임점수저장 : 숫자 int[]
	      int[] scores = new int[5];
	      
	      // 위 배열에 입력받아 저장 -> 방이 다섯개 -> 5개 입력(이름,점수) + 저장 
	      // 한명 이름입력받아 저장 -> 그사람의 점수 입력받아 저장 
	      // => 5반복 : 한번 반복할때, 이름입력+저장하고 점수입력+저장 
	      for(int i = 0; i < users.length; i++) {
	         // 이름 입력받고 > 메세지 출력 입력받아 저장 
	         System.out.println("이름 입력 : ");
	         users[i] = sc.nextLine(); // users 에 저장
	         // 점수 입력받고
	         System.out.println("점수 입력 : ");
	         scores[i] = Integer.parseInt(sc.nextLine()); // scores에 저장 
	      }
	     
		
			
	// 문제 2-2. 위 저장된 users와 scores를 아래와 같은 형태로 출력.
		//콘솔출력 ex) 
		/* user_name		score
		 ---------------------------
		 	피카츄			87
		 	파이리			24
		 	....
		 */
	      /*
	      System.out.println("user_name\tscore");
    	  System.out.println("-------------------");
	      
	      for(int i = 0; i < users.length; i++) {
	    	  
		      System.out.println( users[i] +"\t\t " + scores[i]);
		  } 
		    */   
	      
	// 문제 2-3. 두번째 유저의 점수와 세번째 유저의 점수가 서로 바뀌어서 저장이 되었다합니다.
		// 두개의 점수만 교환해주세요.
	/*
	      int temp = scores[1];
	      	scores[1] = scores[2];
	      	scores[2] = temp;
	      	
	      	for (int i = 0; i<scores.length; i++) {
	      		System.out.println(scores[i]);
	      	}
	  */
	      
	// 문제 2-4. 점수가 높은 순으로 출력되는 게임 랭킹보드를 출력하세요. 랭킹보드는 1~5위까지
		//콘솔출력 ex)
		/* rank		user_name	score
		---------------------------------
			1		꼬북이		137
			2		피카츄		87
			3		..............	
		
	     
			for (int i = 0; i< scores.length-1; i++) {
				for ( int j=i+1; j<scores.length; j++) {
					if (scores[i] < scores[j]) {
						//점수 자리 교환
						int temp = scores[i];
						scores[i] = scores[j];
						scores[j] = temp;
						//이름 자리 교환도 동시에
						String sTmp = users[i];
						users[i] = users[j];
						users[j] = sTmp;
					}
				}
			}
			System.out.println("rank \t user_neam\t score");
	    	System.out.println("---------------------------");		      
		    for(int i = 0; i < users.length; i++) {		    	  
			   System.out.println( users[i] +"\t\t" + scores[i]);
			  } 
	       */ 
      
	// 문제 2-5. 또 한명의 유저가 게임을 끝냈습니다. 점수와 유저네임을 입력받고, 기존의 게임랭킹보드를 업데이트해 출력하세요.
		//이때 입력받은 새로운 유저의 데이터는 기존의 데이터에 추가 되어야 함 (1-3문제 참고)
		// 업데이트 방법 : 
		// 1) 랭킹은 5위까지만 출력. 새로 입력받은 유저의 점수가 5위보다 낮으면 출력 X,
		// 순위권 안에 들어오는 점수면 순위에 맞춰 출력.
		
		//배열 방 크게 만들기
		      int len = scores.length; // 배열 기존 길이 담기
		      // 두개의 배열 주소 복사해놓기 (레퍼런스 공유)
		      int [] scoresTmp = scores;
		      String [] usersTmp = users;
		      //기존 배열 두개의 공간 6개로 만들기
		      scores = new int[len+1];
		      users = new String[len+1];
		      //xxxTmp 복사해둔 기존 데이터 옮겨담기
		      for (int i =0; i<scoresTmp.length; i++) {
		    	  scores[i] = scoresTmp[i];
		    	  users[i] = usersTmp[i];
		      } // 5명은 정렬이 된 상태로 다시 복사됐을 것임.
		      // 새로운 유저의 이름과 점수 입력 받아서 마지막에 저장.
		     System.out.println("이름>>");
		     users[len] = sc.nextLine();
		     System.out.println("점수>>");
		     scores[len] = Integer.parseInt(sc.nextLine());		
		     // 다시 정렬 
		     for (int i = 0; i< scores.length-1; i++) {
					for ( int j=i+1; j<scores.length; j++) {
						if (scores[i] < scores[j]) {
							//점수 자리 교환
							int temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
							//이름 자리 교환도 동시에
							String sTmp = users[i];
							users[i] = users[j];
							users[j] = sTmp;
						}
					}
				}
		     //랭킹 출력 : 
		    System.out.println("rank \tuser_name \tscore");
		    System.out.println("-------------------------------");		      
			for(int i = 0; i < 5; i++) {		    	  
				System.out.println( (i+1) +"\t\t"+users[i] +"\t\t" + scores[i]);
		    } 
		     
		     
		     
		     
		     
		     sc.close();
		     		
	}

}
