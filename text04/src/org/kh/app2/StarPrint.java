package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class StarPrint {


	public static void main(String[] args) {
		/*
		 
		 ******
		 ******
		 ******
		 ******

		 */
		
		
		for(int i=0;i<4;i++) {			//0	1 ~ 3
			for(int j=0;j<6;j++) {		//0~5	0~5 ~ 0~5
				System.out.print("*");
			}
			System.out.println();
		} System.out.println();
		
		for(int i=0;i<=6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			} System.out.println();
		} System.out.println();
		
		for(int i=0;i<=6;i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print("*");
			} System.out.println();
		} 
		
		
		
		
		
	}	
}
