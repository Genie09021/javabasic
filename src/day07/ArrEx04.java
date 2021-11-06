package day07;

public class ArrEx04 {

	public static void main(String[] args) {
		int [] num = {1,45,32,677,42};
		
		for (int i =0; i<num.length; i++) {
			System.out.println(num[i]);	
		}	
		System.out.println();
		//forEach, 업그레이드for
		// for(변수선언 : 배열) {변수활용...;}
		for (int n : num) {
			System.out.println(n);
		}
			
		String [] str = {"java" , "jsp" , "html" , "spring"};
		for (String s: str) {
			System.out.println(s);
		}
			
			
	}

}