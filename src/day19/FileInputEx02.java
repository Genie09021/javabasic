package day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputEx02 {

	public static void main(Scanner args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("읽어올 파일 전체 경로명 입력 >>");
		String file = sc.nextLine();
		
		System.out.println( file +"문서의 내용");
		FileInputStream fis = null;
		int c = 0; // 읽어온데이터 임시로 담을 변수
		try {
			fis = new FileInputStream(file); // 스트림 객체 생성
			while ((c=fis.read()) != -1) { // 읽어와 c에 담고 그 결과가 -1이 아니면 계속 반복
				System.out.println((char)c); // 읽어온 문자한개를 출력
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) try {fis.close();} catch (IOException e) {e.printStackTrace();}
			if (sc != null) try {sc.close();} catch (Exception e) {e.printStackTrace();}
		}
		
		
		
	}

}
