package org.kh.object2;

import org.kh.object.Member;

public class Memberex2 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("alsrb882");//mem1.id ="alsrb882";
		mem1.setPw("1234");//mem1.pw = "1234";
		mem1.setEmail("alsrb9909@naver.com");//mem1.email ="alsrb9909@naver.com";
		mem1.setBirth(1994);//mem1.birth = 1994;
		mem1.setTel("01097459909");//mem1.tel = "01097459909";
		
		System.out.println(mem1.toString());
		System.out.println("id : "+mem1.getId());
		System.out.println("pw : "+mem1.getPw());
		System.out.println("email : "+mem1.getEmail());
		System.out.println("birth : "+mem1.getBirth());
		System.out.println("tel : "+mem1.getTel());
	}

	
}
