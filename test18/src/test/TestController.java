package test;

import java.util.Arrays;
import java.util.Scanner;

public class TestController {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		String[] personArr = new String[5];
		
		
		for(int i = 0; i < personArr.length; i++) {	//length()
			System.out.print((i+1)+ "번째 주민번호 입력 : ");
			String personId = sc.nextLine();
			if((personId.length() == 14)) { 
				char gender = personId.charAt(7); //901231-'2'190087
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') { //char ' ' 붙여야함
					personArr[i] = personId.substring(0, 8) + "******";
				} else {
					System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
					i--;	
				}
			} else {
				System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
				i--;
			}
		}
		System.out.println("--- 주민번호 정보 등록 완료 ---");
		System.out.println(Arrays.toString(personArr));
	}
}