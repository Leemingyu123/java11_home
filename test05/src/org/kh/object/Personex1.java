package org.kh.object;

public class Personex1 {

	public static void main(String[] args) {
		
		Person lee = new Person(); //앞에 Person이란 class를 만들고 lee를 객체

		lee.name="이민규";
		lee.year= 1994;
		lee.gender = "남성";
		lee.job = "개발자";
		lee.running();
		
		int name;
		
		Person kim = new Person();
		kim.name = "김민규";
		kim.running();
				
		
		
	}

}
