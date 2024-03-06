package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PrepertiesExam {

	public static void main(String[] args) {
		Properties pro = new Properties();
		
		pro.setProperty("job", "developer");	//"job" element
		pro.setProperty("name", "kimkitae");
		pro.setProperty("age", "43");
		pro.setProperty("local", "gasandong");
		
		System.out.println(pro);
		System.out.println("엘리먼트 수 :"+pro.size());
		System.out.println("pro의 name 엘리먼트값 : "+pro.getProperty("name"));
		
		//Properties의 순회 => 열거형으로 해당 엘리먼트의 키(속성)을 가져와 처리해야함
		//for(String s: pro) {}
		Enumeration e = pro.propertyNames();	//.propertyNames = .keyset
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el+":"+pro.getProperty(el));
		}
		
	
	}

}
