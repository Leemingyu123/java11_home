package org.kh.java;
//명령(연산)=> Operation(Opcode+Operand) : 오퍼랜드의 개수에 따라 0주소 방식 ~ 3주소 방식
//입력 항에 따라 : 단항(Unary), 이항(Binary), 삼항(ThreeFlow)
public class Operaion1 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = !b1; //! = opcode, b1은변수 = operand ) 단항연산
		int i1= 70, i2 = 60;
		int i3= i1 + i2; //이항연산
		int max = (i1 > i2) ? i1 : i2; //삼항연산
		
		System.out.println("b1 : "+b1);
		System.out.println("b2 : "+b2);
		System.out.println("i3 : "+i3);
		System.out.println("max : "+max);

	}

}
