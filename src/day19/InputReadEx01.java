package day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReadEx01 {
	public static void main(String[] args) {

		//InputStreamReader : 바이트 스트림 -> 문자 스트림 (해주는 보조 클래스)
		// 텍스트 파일을 읽기 위한 바이트 파일 입력 스트림
		
		FileInputStream fin = null; //바이트 스트림
		InputStreamReader in = null; 
		try {
			
			fin = new FileInputStream("d:\\yhs\\fos.txt");
			in = new InputStreamReader(fin);
			
			System.out.println("encoding : " + in.getEncoding());
			
			int c;
			while ((c= in.read()) != -1) {
				System.out.print((char)c);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fin != null) try {fin.close();} catch (IOException e) {e.printStackTrace();}
			if (in != null) try {in.close();} catch (Exception e) {e.printStackTrace();}
			
		}
		

		
	}

}
