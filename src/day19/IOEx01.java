package day19;

import java.io.File;
import java.io.IOException;

public class IOEx01 {

	public static void main(String[] args) {

		//‪C:\Windows\system.ini
		File f = new File("C:\\Windows\\system.ini");
		long size = f.length();
		System.out.println(size);
		// 파일이름
		String name = f.getName();
		System.out.println(name);
		// 파일 경로
		String path = f.getPath();
		System.out.println(path);
		// 상위 폴더
		String parent = f.getParent();
		System.out.println(parent);
		// 파일 타입 판별
		if(f.isFile()) {
			System.out.println(f.getAbsolutePath() + "는 파일입니다.");
		} else if (f.isDirectory()) {
			System.out.println(f.getAbsolutePath() + "는 디렉토리다");
		}
		
		System.out.println("숨김 속성 : " +f.isHidden());
		System.out.println("읽기 속성 : " +f.canRead());
		System.out.println("쓰기 속성 : " +f.canWrite());
		// 마지막 변경시간 리턴
		long time = f.lastModified();
		System.out.println(new java.util.Date(time));
		
		File f2 = new File ("C:\\\\Windows");
		//디렉토리내의 파일과 서브디렉토리 리스트를 File 배열로 리턴.
		File[] subfiles = f2.listFiles();
		for (int i =0; i< subfiles.length; i++) {
			System.out.println(subfiles[i].getName());
			System.out.println("\t 파일 크기 : " + subfiles[i].length());
		}
		
		File f3 = new File("d:\\yhs\\kor.txt");
		// 예외처리해줘야함.try -catch 구문으로 처리.
		try {
			f3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
