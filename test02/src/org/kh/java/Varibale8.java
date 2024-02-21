package org.kh.java;

public class Varibale8 {

	public static void main(String[] args) {
		// 가변할당(동적할당) : 자료형과 무관하게 해당하는 리터럴(값)에 의해 자료형이자유롭게 변형되어 할당
		var num1 = 29.456;
		var num2 = 34;
		var num3 = 'k';
		var num4 = "이민규";
		var num5 = true;
		num1 = 67; //var num1이 가변할당됨
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		System.out.println("num5 : "+num5);

	}

}
