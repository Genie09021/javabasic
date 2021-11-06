package day08;

//import java.util.Scanner;

public class ArrEx06 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		// 문제1. 2차원 배열 arr을 출력해보세요. 
				/*
					1
					1  2  3
					1
					1  2  3  4
					1  2
			
		int [][] arr = {{1},{1,2,3},{1}, {1,2,3,4}, {1,2}};
		for (int i =0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
			*/
		// 문제2. Scanner로 소문자 알파벳 하나 입력받고, 아래와 같이 출력되게 해보세요.  --> ascii 코드와 호환
				/* 콘솔예시)
					소문자 알파벳 하나를 입력하세요>> e (<--사용자가입력)
					abcde	97 98 99 100 101
					abcd	97 98 99 100
					abc		97 98 99 
					ab		97 98
					a		97
		
		System.out.print("소문자 알파벳을 입력하세요");
		String alpha = sc.nextLine();
		// 아스키코드 번호 확인 a = 97, e = 101
		char c = alpha.charAt(0);
		
		for (int i =c; i >=97; i--) {
			for (int j = 97; j <= i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		*/
		
		// 문제3. 양의 정수 10개를 입력받아 배열에 저장하고, 3의 배수만 출력하는 프로그램 작성해보세요. 
		/*
		Scanner sc = new Scanner(System.in);
	    int arr[] = new int[10];
	      
	    System.out.print("양의 정수 10개를 입력하시오 >> ");
	    for(int i=0; i<arr.length; i++) {
	       arr[i] = sc.nextInt();
	      }
	      
	    System.out.print("3의 배수는 ");
	    for(int i=0; i<arr.length; i++) {
	    	if(arr[i] % 3 == 0) {
	            System.out.print(arr[i]+ " ");
	         }
	      }
	      
	      sc.close();
	  
*/
		
				
		// 문제4. 4x4의 2차원 배열(총16개방)을 만들고, 1 ~ 10까지 범위의 정수를 10개만 랜덤하게 생성하여 임의의 위치에 저장하세요. 
				//		동일한 랜덤값이 있어도 상관없으며, 나머지 6개의 숫자는 모두 0 으로 만드로 4x4 형태로 출력
				/*
						ㅇ출력예)
						3  0  7  2
						0  8  1  4
						2  6  0  5
						0  0  7  0
			
		
		int [][] arr = new int[4][4]; 
		int x = 0;
		int y = 0;
		int random =0;//random 랜덤 생성 갯수

	      while(random < 10 ) {
	         x = (int)(Math.random()*4); //x에 0~4까지의 랜덤 수 넣기
	         y = (int)(Math.random()*4); //y에 0~4까지의 랜덤 수 넣기
	         if(arr[y][x]==0) {  //arr[x][y]에 값이 없으면 랜덤 수 넣기
	            arr[y][x] = (int)(Math.random()*10+1);
	            random++;
	         }
	      }
	      
	      for(int i=0; i<arr.length; i++) {
	         for(int j=0; j<arr[i].length; j++) {
	            System.out.print(arr[i][j]+" ");
	         }
	         System.out.println();
	      }
	   

			*/
		// 선생님 풀이
		int [][] board = new int[4][4]; // 4x4 판
		int [] randNums = new int[10];	// 랜덤 미리 뽑아서 10개 저장할 배열
		// 보드 0으로 초기화
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j>board[i].length; j++) {
				board[i][j] = 0;
			}
		}
		// 10개 랜덤 받기
		for (int i =0; i< randNums.length; i++) {
			randNums[i] = (int)(Math.random()*10+1);
		}
		//int count = 0;
		// 임의의 위치에 랜덤값 저장, 위치 중복 x ==> 랜덤 위치의 값이 0이 아닐때 
		for (int i =0; i < randNums.length; i++) {
			// 임의의 인덱스번호 뽑기 x=행, y = 열
			int x = (int)(Math.random()*4); // 0 1 2 3
			int y = (int)(Math.random()*4);	// 0 1 2 3
			if(board[x][y] != 0) { // 이미 한번 뽑힌 자리라면 
				i--;
			} else {
				board[x][y] = randNums[i];
			}
			//count++;
		}
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board[i].length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	
		//System.out.println("count : " +count);
		
	}

}
