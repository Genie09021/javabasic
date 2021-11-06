package day16;

public class SBEx01 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer ("sunny");
		StringBuffer sb2 = new StringBuffer ("day");
		System.out.println(sb.equals(sb2));
		// StringBuffer의 equals()는 오버라이딩 되지 않아서 Object의 날것 그대로 사용
		/*
		System.out.println(sb);
		int s =  sb.capacity();
		System.out.println(s);
		int len = sb.length();
		System.out.println(len);
		*/
		/*
		StringBuffer sb3 = sb.append(sb2);
		System.out.println(sb3);
		
		sb.append(sb2);
		System.out.println(sb);
		sb.append("hello");
		System.out.println(sb);
		*/
		sb.insert(2, "HAHAH");
		System.out.println(sb);
		sb.delete(2, 4);
		
		
	}

}
