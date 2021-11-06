package day07;

import java.util.Scanner;

public class ArrEx03 {
	public static void main(String[] args) {
		
		// 문제1. 아래와 같은 형태의 정방배열을 만들어 값을 저장하고 출력해보세요. 
	      /*
	         10   20   30
	         40   50   60
	         70   80   90
	      */
		//정방 배열 
		/*
	      int [][] ar = new int [3][3];
	     //각 방에 값 대입 : 배열명 [행인덱스][열인덱스ㅡ] 
	     
	      //초기화 
	      int [][] arr = {{10,20,30},
	    		  		{40,50,60},
	    		  		{70,80,90}};// 3행3열
	      for (int i = 0; i<arr.length; i++) { // 행기준 반복
				for (int j = 0; j<arr[i].length; j++) { // 열 기준 반복 
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			
	      // 문제2. int형 3행 2열의 정방배열을 만들고, 각 방에 정수를 입력받아 저장하고 출력하세요. 
		// [0][0] [0][1] , [1][0] [1][1] , [2][0] [2][1] 
		
		Scanner sc = new Scanner(System.in);
		int [][] ar = new int[3][2];
		System.out.println("정수를 입력하세요>>");
		
		for(int i = 0; i < ar.length; i++) {
			for (int j = 0; j<ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
				System.out.println(ar[i][j]);
			}
		 }
		*/
		
		//문제 3. 아래와 같은 형태의 비정방 배열을 만들어 아래와 동일하게 값을 저장하고 출력하세요.
		/*
		  	10 11 12
		  	20 21
		  	30 31 32
		  	40 41	 
		 
	
		
	//	System.out.println(arr3.length); // 행의 길이 4
	//	System.out.println(arr3[0].length); //3
	//	System.out.println(arr3[1].length); //2
	
		int [][] arr3 = {{10, 11, 12},{20, 21},{30, 31, 32}, {40, 41}};
		for (int i =0; i<arr3.length; i++) {
			for (int j = 0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		
		 //다른 풀이
		  int [][] arr3 = new int [4][];
		  arr3[0] = new int[3]; // 0번 행에는 방 3개짜리 만들기
		  arr3[1] = new int[2]; // 1번 행에는 방 2개까지 만들기
		  
		  
		  
		  
		  for (int i =0; i<arr3.length; i++) {
			for (int j = 0; j<arr3[i].length; j++) {
				arr3[i][j] = (i+1)*10 + j;
			}
		}
		for (int i =0; i<arr3.length; i++) {
			for (int j = 0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
	 */
		
		
		/*
	  		문제 4. 한층에 5호씩 있는 3층짜리 아파트가 있다.
	  		1) 배열로 만들어서 각 호마다 관리비를 입력받고, 전체 출력해보세요
	  		[0][0] , [0][1], [0][2], [0][3], [0][4]
	  		[1][0] , [1][1], [1][2], [1][3], [1][4]
	  		[2][0] , [2][1], [2][2], [2][3], [2][4]
	  	*/	
		/*
	  		Scanner sc = new Scanner(System.in);
			int [][] ar = new int[3][5];
			int total = 0;
			double avg = 0.0;
			
			System.out.println("관리비를 입력하세요>>");
			
			for(int i = 0; i < ar.length; i++) {
				for (int j = 0; j<ar[i].length; j++) {
					ar[i][j] = sc.nextInt();
					System.out.print(ar[i][j]+ "\t");	
					
				}
				
				System.out.println();
			}
		*/
		
			
	  		//2) 층별 관리비 평균을 구해서 출력해보세요
		/*
		Scanner sc = new Scanner(System.in);
		int [][] ar = new int[3][5];
		int total = 0;
		
		
		System.out.println("관리비를 입력하세요>>");
		
		for(int i = 0; i < ar.length; i++) {
			for (int j = 0; j<ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
				System.out.print(ar[i][j]+ "\t");	
				total +=ar[i][j];
			}
			
			System.out.println("\n"+ (i+1) +"층 관리비의 총액은 :" + total );
			System.out.println((i+1)+"층 관리비의 평균은 :" + total/5);
			total = 0;
		}
		*/
			
	  		//3) 전체 관리비 평균을 구해서 출력해보세요
		/*
		Scanner sc = new Scanner(System.in);
		int [][] ar = new int[3][5];
	  		
		int sum = 0;
	  	int count = 0;
	  	double avg;
	  	System.out.println("관리비를 입력하세요>>");
	  	
	  		for(int i = 0; i < ar.length; i++) {
	  			for (int j = 0; j<ar[i].length; j++) {
	  				ar[i][j] = sc.nextInt();
	  				System.out.print(ar[i][j]+ "\t");	
				
	  			}		
	  			System.out.println();
	  		}
	  		
	  		for (int i =0; i<ar.length; i++) {
	  			for (int j=0; j<ar[i].length; j++) {
	  				sum += ar[i][j];
	  				count++;
	  			}
	  		}
	  		System.out.println("\n"+"전 층의 관리비 총액 : " + sum);
	  		avg = (double)sum/count;
	  		System.out.println("전 층의 관리비 평균 : " + avg);
	  	*/	
	  		
			
	  	//	4) 103호와 203호의 관리비가 서로 바뀌었다고 해요, 교환해주세요
	  	/*	
	  		Scanner sc = new Scanner(System.in);
			int [][] ar = new int[3][5];
			int total = 0;
			double avg = 0.0;
			
			System.out.println("관리비를 입력하세요>>");
			
			for(int i = 0; i < ar.length; i++) {
				for (int j = 0; j<ar[i].length; j++) {
					ar[i][j] = sc.nextInt();
					System.out.print(ar[i][j]+ "\t");	
					
				}
				
				System.out.println();
			}
	  		
	  		 	int temp = ar[2][2];
	      		ar[2][2] = ar[1][2];
	      		ar[1][2] = temp;
	      		System.out.println("-------103호 203호 관리비 교환-------");
	      		for (int i = 0; i<ar.length; i++) {
	      			for (int j =0; j<ar[i].length; j++) {
	      				
	      				System.out.print(ar[i][j] + "\t");
	      			}
	      			System.out.println();
	      	}
	          */
	
	//  		5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요
	  		/*
	  		Scanner sc = new Scanner(System.in);
			int [][] ar = new int[3][5];
		  		
			int sum = 0;
		  	int count = 0;
		  	int avg;
		  	System.out.println("관리비를 입력하세요>>");
	  	
	  		for(int i = 0; i < ar.length; i++) {
	  			for (int j = 0; j<ar[i].length; j++) {
	  				ar[i][j] = sc.nextInt();
	  				System.out.print(ar[i][j]+ "\t");	
				
	  			}		
	  			System.out.println();
	  		}
	  		
	  		for (int i =0; i<ar.length; i++) {
	  			for (int j=0; j<ar[i].length; j++) {
	  				sum += ar[i][j];
	  				count++;
	  			}
	  		}
	  		System.out.println("\n"+"전 층의 관리비 총액 : " + sum);
	  		avg = sum/count;
	  		System.out.println("전 층의 관리비 평균 : " + avg);
	  		
	  		*/
		
	  		//6) 관리비를 가장 적게 사용한 호수와 가장 많이 사용한 호수를 출력해보세요
	  		//문제. 최대값, 최소값 구하기 -- 비교 
		/*
		int max = ar[i][j];
		int min = ar[i][j];
		
		for (int i = 0; i < ar.length; i++) {
		    if(max<ar[i]) {
		    	//max의 값보다 ar[i]이 크면 max = ar[i]
		    	max = ar[i];
		        }
		    			
		        if(min>ar[i]) {
		    	//min의 값보다 ar[i]이 작으면 min = ar[i]
		    	min = ar[i];
		        }
		} 
		
		System.out.println(max);
		System.out.println(min);
	  		*/
	  		//7) 심화 : 관리비 적게 나온 순으로 정렬해보세요.
				
	}

}
