package day18;

import java.util.Enumeration;
import java.util.Properties;

public class PropEx01 {
	public static void main(String[] args) {

		Properties p = new Properties();
		
		p.setProperty("id", "global");
		p.setProperty("sid", "orcl");
		p.setProperty("url", "nullmaster");
		p.setProperty("port", "1521");
		
		System.out.println(p);
		
		String value = p.getProperty("id");
		System.out.println(value);
		
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key + " : "+p.getProperty(key));
		}

	}

}
