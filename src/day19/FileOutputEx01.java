package day19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx01 {

	public static void main(String[] args) {

		byte []b = {1,6,38,-7,40,21};
		
		try {
			// 파일 출력스트림 생성
			FileOutputStream fout = new FileOutputStream("d:\\yhs\\test.out");
			// 파일 쓰기
			for (int i = 0; i<b.length; i++) {
				fout.write(b[i]);
			}
			// 한번에 쓰기
			//fout.write(b);
			
			// 스트림 닫기
			fout.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
