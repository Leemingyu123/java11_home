package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {
		byte b = 10; //선언(o), 초기화(o)
		short s = 20;
		int i; //선언(o), 초기화(x) => 그냥 초기화 되지 않은 상태로 출력시 Null Pointer 오류 발생
		long l;
		i = 30; //초기화
		l = 55555555555L; //초기화
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
//		b = 130; Overflow
//		b = -130; Underflow
		
	}

}
