package day15;

public class ExceptEx04 {
	public static void main(String[] args) {
	
		String [] strNumber = {"23", "45" , "12.456", "432"};
		int i = 0;
		try {
			for (i = 0; i < strNumber.length; i++) {
				int j = Integer.parseInt(strNumber[i]);
				System.out.println("정수로 변환된 값 :" + j);
			}
		} catch (NumberFormatException e) {
			System.out.println(strNumber[i]+"는 정수로 변환할 수 없습니다.");
			
		}
		//java.lang.NumberFormatException: For input string: "12.456"
		
		
		/*
		 * String [] strNumber = {"23", "45" , "12.456", "432"};
		int j =0;
		for (int i = 0; i < strNumber.length; i++) {
			System.out.println("정수로 변환된 값 :" + j);
			try {
					j = Integer.parseInt(strNumber[i]);
				
			} catch (NumberFormatException e) {
				System.out.println(strNumber[i]+"는 정수로 변환할 수 없습니다.");	
			}
		}
		 */
	}

}
