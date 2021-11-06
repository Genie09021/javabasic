package day16;

public class StringEx02 {

	public static void main(String[] args) {
/*
		char [] c = {'a','b','c'};
		String s = new String(c);
		System.out.println(s);
*/		
		/*
		int value = 100;
		String strValue = String.valueOf(value);
		System.out.println(strValue);
		
		String strValue2 = value+"";
		System.out.println(strValue2);
		*/
		
		String fullName = "Hello.java"; // Hello 

		int idx = fullName.lastIndexOf(".");
		
		String fileName = fullName.substring(0, idx); // Hello
		String ext = fullName.substring(idx);//.java
		
		System.out.println("파일명 : " + fileName);
		System.out.println("확장자 : " + ext);
		
		
		
		
	}

}
