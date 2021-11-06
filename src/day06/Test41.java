package day06;

import java.util.Scanner;

public class Test41 {
	public static void main(String[] args) {

		//문제 1-1. int 형의 방 5개 배열을 만들고, 10,20,30,40,50을 저장하고 출력.
		//int [] score = {10, 20, 30, 40, 50};
		//int sum = 0;
		//for (int i = 0; i < score.length; i++) {
			//System.out.println(score[i]);
		
		//문제 1-2. 위에서 만든 배열을 이용하여, 인덱스번호 1번과 3번안에 있는 데이터의 합을 출력
		//System.out.println(score[1] + score [3]);
		
		//문제 1-3. 인덱스 번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.println("인덱스 번호를 입력하세요>>");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println(score[num]);
			
		
		//문제 1-4. 배열 안의 모든 요소를 다 더한 값을 출력
			
			sum += score[i];
			System.out.println(sum);
		}	
		
							
		//문제 1-5. 배열 안에 있는 값중 한개를 입력하면, 그 값이 위치한 인덱스번호를 출력.
			Scanner sc = new Scanner(System.in);
			System.out.println("인덱스 번호를 입력하세요>>");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num== score[i]) {
				System.out.println(i);	
			}
		}	
				
			
		//문제 1-6. 인덱스번호 2번과 4번방의 값을 교환해서 저장.
			int temp = score[2];
			score[2] = score[4];
	        score[4] = temp;
	        for (int i = 0; i <score.length; i++){
	        System.out.println(score[i]);
	        }        
		*/
		/*
		//문제 1-7. (심화) 내림차순으로 정렬 (큰수 -> 작은수 순서로 다시 저장)
		// 선택 정렬 : 가장 큰수 구해서 앞으로 자리이동. 
		//자리이동은 가장 큰 숫자가 들어있는 방번호룰 알아야 방번호끼리 교환 
	      int [] score = {10,20,50,40,30};
	        for (int i = 0; i<score.length; i++) {
	        	int max = i; // 시작값 넣기
	        	//최대값 위치 찾기
	        	for(int j=i; j < score.length; j++) {
	        		if(score[max] < score[j]) {
	        			max = j;
	        		}
	        	}
	        	// max에 최대값의 인덱스 번호가 남아있음.
	        	int temp = score[i];
	        	score[i] = score[max];
	        	score[max] = temp;
	        }
	        //출력해서 확인
	        for (int i =0; i < score.length; i++) {
	        	System.out.println(score[i]);
	        }
	        */
		//버블 정렬
	        int [] arr = {10, 20, 50, 40, 30};
	        
	        for (int i = 0; i <arr.length; i++) {
	        	for (int j=i; j<arr.length; j++) {
	        		if (arr[i] > arr[j]) {
	        			int temp = arr[i];
	        			arr [i] = arr [j];
	        			arr [j] = temp;
	        		}
	        	}
	        }
	      //출력해서 확인
	        for (int i =0; i < arr.length; i++) {
	        	System.out.println(arr[i]);
	        }
		
		
		
		
		
		
		
		
		
		
	}

}
