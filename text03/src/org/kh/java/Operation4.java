package org.kh.java;
//증감 연산 : ++, --=> 전위연산, 후위연산이 각 각 있다


public class Operation4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		//a++ => a= a+1
		System.out.println("전위증가연산 : "+(++a)); // +를 하고 출력시켜라
		System.out.println("후위증가연산 : "+(b++)); // b를 먼저  출력하고 증가시켜라 
		System.out.println("전위감소연산 : "+(--a)); 
		System.out.println("후위감소연산 : "+(b--)); 
		System.out.println("a : "+a);
		System.out.println("b : "+b);

	}

}
