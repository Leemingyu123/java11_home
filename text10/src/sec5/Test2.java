package sec5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = {"홍길동", "김성훈","윤웅식","윤성우","남궁인"};
		
		String searchName = sc.next();
		
		boolean result = false;
		
		for (int i=1; i<= memberArr.length; i++) {
			if(memberArr[i] == searchName) {
				result = true;
				break;
			}
		}
		if(result) {
			System.out.println("회원이 존재하지 않습니다.");
		}else {
			System.out.println("회원이 존재합니다.");
		}

	}

}
