package day05;



public class Test37 {

	public static void main(String[] args) {
		
		// 1.jpg --해결
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i +"행 : " + "***");
			
		}
				
		// 2.jpg --해결
		/*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 3.jpg -- 해결
		/*
		for (int i = 1; i<= 5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 4. jpg -- 해결
		
		for (int i = 0; i < 5; i++) {
			for (int j = i+1 ; j <=i+5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}	
		*/		
		/*
		// 5. jpg --해결 
		for (int i = 4; i >= 0; i--) { // 세로줄 
			for (int j = i+1 ; j <=i+5; j++) { // 가로줄
				System.out.print(j);
			}
			System.out.println();
		}	
		System.out.println();
		*/
		
		/*
		// 6. jpg -- 해결
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}

		for (int i = 1; i<=5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		또 다른 풀이
		int star = 1;
		boolean toogle = true; //별이 증가할지 감소할지 판별
		for (int i = 0; i <9; i++) {
			for (int j = 0; j < star; j++) {
				System.out.print("*")
			}
			if(toggle) star ++;
			else star --;
			
			if (star == 5) {
				toggle = false;
			}
			
			
			System.out.println();
		}		
		
		*/
		
		/*
		//7. jpg. --ㅎ해결
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		
		
		// 8. jpg. -- 해결
		for (int i = 0; i<5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <5; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
	*/
	

	
		//9. jpg -- 해결
		/*
		for (int i = 1; i <= 4; i++) {
			for (int j = i; j <5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		for (int i = 0; i<5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <5; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		*/
		 /*
		// 10.jpg
		for (int i = 1; i <= 9; i+=2) {
			for (int j = i/2; j <4; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
	*/
		// 11. jpg
		
/*
		for (int i = 9; i >= 1; i-=2) { 
			for (int j = i/2; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}

	*/	
		
		
		// 12. jpg
		/*
		for (int i = 1; i<=5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		 */
		
		// 13. jpg
		/*
		for (int i = 0; i<5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <5; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		for (int i = 2; i <= 5; i++) {
			for (int j = i; j <5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		*/
		
		// 14. jpg 
		/*
		for (int i = 1; i <= 9; i+=2) { 
			for (int j = i/2; j <4; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		for (int i =7; i >= 1; i-=2) { 
			for (int j = i/2; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		*/
		
		
		//15. jpg
		/*
		for (int i = 1; i <= 10; i+=2) { 
			for (int j = i/2; j <5; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = i/2; j <5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =7; i >= 1; i-=2) { 
			for (int j = i/2; j < 5; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <= i ; j++) {
				System.out.print(" ");
			}
			for (int j = i/2; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//16. jpg
		/*
		for (int i = 10; i >= 1; i-=2) { 
			for (int j = i/2; j < 6; j++) {
				System.out.print("*");
			}
			for (int j = 2; j < i ; j++) {
				System.out.print(" ");
			}
			for (int j = i/2; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= 9; i+=2) { 
			for (int j = i/2; j <5; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <=i+1; j++) {
				System.out.print(" ");
			}
			for (int j = i/2; j <5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for (int i = 0; i < 1; i++) { 
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i +1 ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= 9; i+=2) { 
			for (int j = i/2; j <5; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <=i+1; j++) {
				System.out.print(" ");
			}
			for (int j = i/2; j <5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//17.jpg
		
		
		for (int i = 9; i >= 1; i-=2) { 
			for (int j = i/2; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}

		for (int i = 3; i <= 9; i+=2) { 
			for (int j = i/2; j <4; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
	*/
		
			
		
		
		
		
	} //main

}//class
