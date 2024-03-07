package org.kh.app;
//조건문 if : if(조건식) {처리할문장} 처리할문장이 하나일경우 중괄호{} 생략
public class Condition1 {

	public static void main(String[] args) {
		int point = 80;
		String pass = "불합격";
		//판정(pass)는 점수(point)가 70점 이상이면 "합격", 아니면 "불합격"
		if (point >=70) pass= "합격";
		/*
		 * if (point >=70) {
		 
			pass= "합격";
		}
		if (point >=70) {pass= "합격";}
		*/
		if (point <70) pass = "불합격";
		System.out.printf("\n당신의 점수는 %d이며, 판정은 %s입니다.", point, pass);
		String pass2 = (point>=70) ? "합격" : "불합격";
		System.out.println("\n점수= "+pass2);
	}

}
