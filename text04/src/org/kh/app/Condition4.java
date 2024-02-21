package org.kh.app;

import java.util.Scanner;

//조건문 다단계 if
public class Condition4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력 [0~100] :"); 
		int point = scan.nextInt(); 
		String result;
		/*점수를 키보드로 입력받아 판정과 학점 그리고, 시상내용을 쓰시오
		 * 학점(result)은 점수가(point)가 
		 97~100이면 'A+', 93~96은'A0', 90~92은 'A-'
		 87~89이면 'B+', 83~86은 'B0', 80~82는 'B-'
		 77~79이면'C+', 73~76은 'C0', 70~72는 'C-'
		 67~69이면 'D+', 63~66은 'D0', 60~62는 'D-'
		 60미만이면 'F'로 하되, 다단계 if와 if/esle if/else 문 활용 
		 시상내용은 학점이 A+이면, '학업우수상', 'A0'이면, '노력상',
		 'A-'면 '아차상'으로 하고, 나머지는 ''으로 하되, switch~case~문 활용
		 */
		
		if(point>=97 ) {result = "A+";} else if(point>=93) {result = "A0";} else if(point>=90) {result = "A-";}
		else if(point>=87) {result = "B+";} else if(point>=83) {result = "B0";} else if(point>=80) {result = "B-";}
		else if(point>=77) {result = "C+";} else if(point>=73) {result = "C0";} else if (point>=70) {result = "C-";}
		else if(point>=67) {result = "D+";} else if(point>=63) {result = "D0";} else if (point>=60) {result = "D-";}
		else {result = "F";}
		
		/*
		if(point>=90) {
			result = "A";
			if((point%10>=7 && point%10<=9) || point==100) {
				result = result + "+";
			} else if(point%10>=3 && point%10<=6) {
				result = result + "0";
			} else {
				result = result + "-";
			}
		} else if(point>=80) {
			result = "B";
			if(point%10>=7 && point%10<=9) {
				result = result + "+";
			} else if(point%10>=3 && point%10<=6) {
				result = result + "0";
			} else {
				result = result + "-";
			}
		} else if(point>=70) {
			result = "C";
			if(point%10>=7 && point%10<=9) {
				result = result + "+";
			} else if(point%10>=3 && point%10<=6) {
				result = result + "0";
			} else {
				result = result + "-";
			}
		} else if(point>=60) {
			result = "D";
			if(point%10>=7 && point%10<=9) {
				result = result + "+";
			} else if(point%10>=3 && point%10<=6) {
				result = result + "0";
			} else {
				result = result + "-";
			}
		} else {
			result = "F";
		}
		*/
/*
		if((point%10>=7 && point%10<=9 && point>=60) || point==100) {
			result = "+";
			if(point>=90) {
				result = "A"+result;
			} else if(point>=80) {
				result = "B"+result;
			} else if(point>=70) {
				result = "C"+result;
			} else {
				result = "D"+result;
			}	
		} else if(point%10>=3 && point%10<=6 && point>=60) {
			result = "0";
			if(point>=90) {
				result = "A"+result;
			} else if(point>=80) {
				result = "B"+result;
			} else if(point>=70) {
				result = "C"+result;
			} else {
				result = "D"+result;
			}	
		} else if(point%10>=0 && point%10<=2 && point>=60) {
			result = "-";
			if(point>=90) {
				result = "A"+result;
			} else if(point>=80) {
				result = "B"+result;
			} else if(point>=70) {
				result = "C"+result;
			} else {
				result = "D"+result;
			}
		} else {
			result = "F";
		}

		//switch~case~ : 
		/*
		switch(비교대상){
			case 값1:
				실행문;
				break;
			case 값2:
				실행문;
				break;
			.....	
			case 값n:
				실행문n;
				break;
			default:
				실행문;
		} 
		*/
		String remark = "";
		switch(result){
			case "A+":
				remark = "학업우수상";
				break;
			case "A0":
				remark = "노력상";
				break;
			case "A-":
				remark = "아차상";
				break;
			default:
				remark = "";
		} 
		System.out.println("당신의 점수 : "+point);
		System.out.println("당신의 학점 : "+result);
		System.out.println("당신의 시상내역 : "+remark);
		
		
		System.out.printf("\n당신의 점수는 %d 입니다. ", point);
		System.out.println("\n당신의 학점은 "+result);
		
		
		


	}

}
