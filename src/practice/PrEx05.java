package practice;

import java.util.Scanner;

public class PrEx05 {

	public static void main(String[] args) {
		/*
  		문제 4. 한층에 5호씩 있는 3층짜리 아파트가 있다.
  		1) 배열로 만들어서 각 호마다 관리비를 입력받고, 전체 출력해보세요
  		[0][0] , [0][1], [0][2], [0][3], [0][4]
  		[1][0] , [1][1], [1][2], [1][3], [1][4]
  		[2][0] , [2][1], [2][2], [2][3], [2][4]
		*/	
		
		int [][] apart = new int [3][5];
		Scanner sc = new Scanner(System.in);
		for (int i =0; i< apart.length; i++) {
			for (int j =0; j< apart[i].length; j++) {
				System.out.println("해당 호수의 관리비를 입력하세요 (만원) >>");
				apart[i][j] = sc.nextInt();
			}
		}
		for (int i =0; i< apart.length; i++) {
			for (int j=0; j< apart[i].length; j++) {
				System.out.print(apart[i][j] + "\t");
			}
			System.out.println();
		}
		
		//	2) 층별 관리비 평균을 구해서 출력해보세요
		
		int sum =0;
		for (int i = 0; i< apart.length; i++) {
			for (int j = 0; j< apart[i].length; j++) {
				sum += apart[i][j];
				
			}
			System.out.println( (i+1) + "층 관리비의 평균은 : "  + sum /5 + "만원");
			sum =0;
		}
		
		//	3) 전체 관리비 평균을 구해서 출력해보세요
		int all =0;
		for (int i = 0; i< apart.length; i++) {
			for (int j = 0; j< apart[i].length; j++) {
				all += apart[i][j];
				
			}
		}
		System.out.println( "전체 관리비의 평균은 : "  + all/15 + "만원");
		
		
		//	4) 103호[1][2]와 203호[2][2]의 관리비가 서로 바뀌었다고 해요, 교환해주세요
		
		for (int i = 0; i < apart.length; i++) {
			for (int j =0; j<apart[i].length; j++) {
				int temp = apart[1][2];
				apart[1][2] = apart[2][2];
				apart[2][2] = temp;
			}
		}
		for (int i = 0; i< apart.length; i++) {
			for (int j =0; j< apart[i].length; j++) {
				System.out.print(apart[i][j]+ "\t");
			}
			System.out.println();
		}
		
		//	5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요

		for (int i = 0; i < apart.length; i++) {
			for (int j =0; j<apart[i].length; j++) {
				if (apart[i][j] < all/15) {
					System.out.println(" 전체 관리비 평균보다 적게 사용한 호수는 : " + (i+1) + "0" + (j+1) + "호");
				}
				
			}
		}
		
		
		//6) 관리비를 가장 적게 사용한 호수와 가장 많이 사용한 호수를 출력해보세요
  		//문제. 최대값, 최소값 구하기 -- 비교 
		/*
		int max = 0;
		int min = 0;
		
		for (int i = 0; i< apart.length; i++) {
			for (int j =0; j<apart[i].length; j++) {
				if (max < apart[i][j]) {
					max = apart[i][j];
				}			
			}
		}
		System.out.println("가장 많은 관리비 : " + max + "만원"  );
		
		for (int i = 0; i< apart.length; i++) {
			for (int j =0; j<apart[i].length; j++) {
				if (min > apart[i][j] && apart[i][j] != 0) {
					min = apart[i][j];
				}
			}	
		}
		System.out.println("가장 적은 관리비 : " + min + "만원");
*/
		int max = 0;
		int min = apart[0][0];
		
		for (int i = 0; i< apart.length; i++) {
			for (int j =0; j<apart[i].length; j++) {
				if (max < apart[i][j]) {
					max = apart[i][j];
				}			
			}
		}
		System.out.println("가장 많은 관리비 : " + max + "만원"  );
		
		for (int i = 0; i<apart.length; i++) {
			for (int j =0; j<apart[i].length; j++) {
				if (min > apart[i][j] ) {
					min = apart[i][j];
				}
			}	
		}
		System.out.println("가장 적은 관리비 : " + min + "만원");
		
	
		
	}

}
