package org.kh.java;
//대입 연산자 : 연산 후에 대입하는 연산자 +=, -=, *=, /=, %=, &=, ㅣ=(2진수연산), >>=, <<=, >>>=, ^= 
//비트 연산자 : &(and), |(or), ~(complement=not), ^(xor), >>(>>>right shift), <<(<<<left shift),
public class Operation7 {

	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int tmp; // null, 임시기억장소(tmp)
		a += b; // a=35, b=15
		b -= a; // a=35, b= b-a = 15-35 = -20
		System.out.println("a = "+a);
		System.out.println("b = "+b);

		//a와b의 값을 맞교환
		tmp = a ;
		a = b;
		b = tmp;
		System.out.println("ㅡㅡㅡ교환후ㅡㅡㅡ ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		//비트(2진수) 연산
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("x = "+Integer.toBinaryString(x));
		System.out.println("y = "+Integer.toBinaryString(y));
		System.out.println("x&y = "+Integer.toBinaryString(x & y)); //and
		System.out.println("x|y = "+Integer.toBinaryString(x | y)); //or
		System.out.println("x^y = "+Integer.toBinaryString(x ^ y));//xor 입력이 서로다를떄 1이다(2진수 계산
		System.out.println("~x = "+Integer.toBinaryString(~x)); //not 1과0 반대로출력됨
		System.out.println("x>>2 :  = "+Integer.toBinaryString(x >> 2)); 
		System.out.println("x<<2 :  = "+Integer.toBinaryString(x << 2)); 
		//right shift 2진수나누기, left shift 2진수곱하기
		System.out.println("ㅡㅡㅡㅡ대입연산자ㅡㅡㅡㅡㅡ");
		//16 8 4 2 1 
//		   1 1 0 0 1
//		   1 1 1 1 0
		
		int i = 25; //1 1 0 0 1
		int j = 30; //1 1 1 1 0
		i &= j; // i =i&j
		System.out.println("i &= j :"+i); //& 1 1 0 0 0 = 16+8 =24
		i = 25;
		i |= j; // i = i|j
		System.out.println("i |= j :"+i); // | 1 1 1 1 1 = 16+8+4+2+1=31
		i = 25;
		i ^= j; // i = i^j
		System.out.println("i ^= j :"+i); // ^ 1 1 1 = 4+2+1 = 7
		j >>= 2; //1 1 1 
		System.out.println("j>>=2: "+j);
		j = 30;
		j <<=2; //1 1 1 1 0 0 0
		System.out.println("j<<=2: "+j);
		j = 30;
		j >>>= 2; 
		System.out.println("j>>>=2: "+j);
//x = 1101
//y = 1011
//    1001 = & 둘다 1이라 1,하나만 아니여도 0
//    1111 = | 하나만 1이여도

	}

}
