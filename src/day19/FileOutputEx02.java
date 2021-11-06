package day19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Scanner;

public class FileOutputEx02 {

	public static void main(String[] args) throws IOException {

		// 파일 이름과 저장할 문자열 입력 받아 생성
		String file, str;
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		
		str = "파일 생성시간 \n\n" + date + "\n\n";
		
		System.out.println("파일 이름 입력 하세요>>"); // d:\\yhs\\fos.txt
		file = sc.nextLine();
		System.out.println("저장할 문자열 입력>>");
		str += sc.nextLine();
		
		// 파일 저장
		FileOutputStream fos = null;  // 스트림 생성
		try {
			byte [] byte_str = str.getBytes(); // str을 byte[]로 변환
			
			fos = new FileOutputStream(file);
			fos.write(byte_str); // 스트림으로 데이터 내보내기, 쓰기
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			fos.close();
			sc.close();
		}
		/*
		finally {			
			if (fos != null) { // fos 객체 생성된게 맞는지 체크하고 닫기
				try { // 예외처리해서
					fos.close(); // 스트림 닫기.
					
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (sc != null) {
				try {
					sc.close();		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		*/
		System.out.println(file + "파일이 정상적으로 처리되었습니다.");
	}

}
