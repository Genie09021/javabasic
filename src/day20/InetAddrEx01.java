package day20;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddrEx01 {

	public static void main(String[] args) throws Exception {

		InetAddress addr1 = InetAddress.getByName("naver.com");
		InetAddress addr2 = InetAddress.getLocalHost();
		System.out.println(addr1.getHostName());
		System.out.println(addr1.getHostAddress());
		System.out.println(addr2.getHostName());
		System.out.println(addr2.getHostAddress());
		
		InetAddress [] addr3 = InetAddress.getAllByName("naver.com");
		for (InetAddress  a : addr3) {
			System.out.println(a.getHostName());
			System.out.println(a.getHostAddress());
		}
		
		System.out.println("===========================");
		
		String str = "http://soluscristus.shop/";
		URL url = new URL(str);
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("포트번호 : " +url.getPort());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("내용 : "+url.getContent());
		
	}

}
