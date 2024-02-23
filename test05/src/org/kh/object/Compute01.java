package org.kh.object;

public class Compute01 {
	void fnc1() { //반환 x, 매개변수x
		System.out.println("메소드함수");
	}
	
	void fnc2(int a) {// 반환 x, 매개변수 o
		System.out.println(a+"를 입력했습니다.");
	}
	int fnc3() { //반환 o, 매개변수x (반환은 받아줄곳이 있어야함)
		return 1004;
	}
	String fnc4(int point) { //반환 o, 매개변수o
		if(point>=80) return "합격";
		else return "불합격";
	}
	
}
