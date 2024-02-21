package org.kh.app;

import java.util.Scanner; //Scanner씀

//조건문 if~elseif(~else~)
public class Condition3 {
//Scanner scan 키보드로 입력받는다
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력 [0~100] :"); //print
		int point = scan.nextInt(); 
		char result;
	/*
	 * 학점(result)은 점수가(point)가 90~100이면 'A', 80~89이면 'B'
	 * 70~79이면'C', 60~69이면 'D', 60미만이면 'F'
	 */
		if(point>=90) {result = 'A';} 
		else if(point>=80) {result = 'B';} 
		else if (point >=70) {result = 'C';} 
		else if (point >=60) {result = 'D';} 
		else {result = 'F';}
		/*
		 * 비교횟수가 많아져 비효율적이다 => ifelse가 더 효율적이다.
		if(point>=90 && point<=100) result = 'A';
		if(point>=80 && point<=89) result = 'B';
		if(point>=70 && point<=79) result = 'C';
		if(point>=60 && point<=69) result = 'D';
		if(point>=0 && point<=59) result = 'F';
*/
	
		System.out.printf("\n당신의 점수는 %d 입니다. ", point);
		System.out.println("\n당신의 점수는 "+point+"점 입니다.");
		System.out.println("당신의 학점은 "+result);
	
	}

}
