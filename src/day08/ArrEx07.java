package day08;

import java.util.Scanner;

public class ArrEx07 {
	public static void main(String[] args) {
		/*
		문제 : Up & Down 게임
		0 ~ 99 사이의 임의의 수를 받아 숨기고, 그 수를 맞추는 게임 임의의 수보다 낮게 입력하면 "Up" 출력, 높게 입력하면 "Down" 출력하면서 범위를 좁혀가며 수를 맞춘다. 게임을 반복하기 위해서  y/n묻고, n인 경우 프로그램 종료. 
		콘솔예) 숫자가 정해졌습니다. 맞춰보세요!!
		0 ~ 99
		1 >>  55 (<-- 사용자 입력) 
		"Up"
		55 ~ 99
		2 >> 70
		"Up"
		70 ~ 99 
		3 >> 85
		"Down"
		70 ~ 85
		4 >> 75
		"Up"
		75 ~ 85
		5 >> 82
		맞았습니다. 다시하시겠습니까?(y/n) >>  y
		숫자가 정해졌습니다. 맞춰보세요!
		0 ~ 99
		1 >> 30
		"Up"
		30 ~ 99
		2 >> 45
		맞았습니다. 
		다시하시겠습니까?(y/n) >> n
		게임종료!!
		
		Scanner sc = new Scanner(System.in);
	    int randNum, userNum;
	    int hint = 10;
	    boolean clear;  
	     
	    while(true) {
	        randNum = userNum = 0;
	        clear = false;
	        randNum = (int)((Math.random() * 100));   // 0 ~ 99
	       // System.out.println("randNum = " + randNum);
	        int i = 0;      
	        while(i < 10) {	         
	            int updown = 0;
	            System.out.print("(1 ~ 100)숫자 입력 = ");
	            userNum = sc.nextInt();
	            hint--;
		    	System.out.println("----남은횟수 "+hint+" 회----");

	            if(userNum > randNum) {
	                updown = 1;
	            }
	            else if(userNum < randNum) {
	                updown = 2;
	            }
	            else {
	                clear = true;
	                break;
	            }       

	            switch(updown) {
	                case 1:
	                    System.out.println("입력한 숫자보다 down!");
	                    break;
	                case 2:
	                    System.out.println("입력한 숫자보다 up!");
	                    break;
	            }	         
	            i++;
	        }

	        if(clear) {
	            System.out.println("정답입니다!");
	        }
	        else {
	            System.out.println("다시 도전해보세요!");
	        }
	         
	        String playAgain;
	         
	        System.out.print("Play one more?(Yes/No) = ");
	        playAgain = sc.next();
	        if(playAgain.equals("N")||playAgain.equals("n")) {
	            System.out.println("Okay Bye!!");
	            break;
	        }       
	    } */
		
		Scanner sc = new Scanner(System.in);
	    boolean play = true; // 게임 진행중인지 상태 가지고 있음
	    
	    while(play) {
	    	// 랜덤값 뽑기
	    	int num = (int)(Math.random()*100); // 0~99까지의 숫자
	    	int guess = -1; // 입력받을ㄹ 변수
	    	int count = 1; // 시도하는 횟수 저장할 변수
	    	int max = 99; // 범위 최대값
	    	int min = 0; // 범위 최솟값
	    	int hint = 10; // 정답을 맞출 수 있는 횟수
		   	System.out.println("----남은횟수 "+hint+" 회----"); // 남은 횟수 메세지 출력
		   	hint--; // 한번 맞출때마다 줄어든다 
	    	// 게임시작 메세지 출력
	    	System.out.println("숫자가 정해졌습니다. 맞춰보세요!");
	    	// 검사해서 결과 알려주기
	    	while (true) {
	    		// 범위 출력
	    		System.out.println(min +"~"+ max);
	    		//입력 받기
	    		System.out.println(count + ">>");
	    		guess = Integer.parseInt(sc.nextLine());

	    		count++;
	    		// 검사해서 결과 알려주기	
	    		if (guess == num) {  // 입력받은 숫자가 맞았을때
	    			System.out.println("맞췃습니다");
	    			System.out.println("다시하시겠습니까?(y/n)>>");
	    			String answer = sc.nextLine();
	    			if(answer.equalsIgnoreCase("n")) {
	    				System.out.println("프로그램 종료");
	    				play = false;
	    				break; // 내부 while문 종료
	    			} else if (answer.equalsIgnoreCase("y")) {
	    				play = true;
	    				break;	// 내부 while문 종료	
	    			} else {
	    				System.out.println("잘못입력");
	    				continue;
	    			}
	    		}
	    		// 못맞췄을때
	    		if (guess < num ) { // 정답보다 낮을걸 입력했을떄
	    			System.out.println("Up");
	    			min = guess; // 범위값 수정
	    		}
	    		if (guess > num) { // 정답보다 낮을걸 입력했을떄
	    			System.out.println("Down");
	    			max = guess; // 범위값 수정
	    		}
	    		
	    	} // 내부 while
	    	
	    } // 외부 while  	
	    	// 범위출력
	    	//입력받기
	    	//검사해서 결과 알려주기
	   
	    
		
		
		
		
		
		
		
		
		
	    
	    
	    
	    
	    sc.close();
	    
	} // main

} // class
