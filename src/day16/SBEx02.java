package day16;

public class SBEx02 {

	public static void main(String[] args) {
		// String vs StringBuffer 속도 차이
		
		long start, end;
		
		String str = new String ("1~10000까지 :");
		StringBuffer sb = new StringBuffer ("1~10000까지 :");
		
		start = System.currentTimeMillis();
		for (int i = 1; i<= 10000; i++) {
			str += i;
			str += "+";
		}
		end = System.currentTimeMillis();
		System.out.println("String : " + (end - start));
		
		
		start = System.currentTimeMillis();
		for(int i = 1; i<=10000; i++) {
			sb.append(i);
			sb.append("+");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer : " + (end - start));
	}

}
