package test;

import java.util.ArrayList;
import java.util.List;
//숫자만큼 -+를 출력해라
public class Test3 {

	public static void main(String[] args) {
		//List<Integer> list = null;
<<<<<<< HEAD
		List<Integer> list = new ArrayList<>();	//list 선언만 있으므로 객체 생성이 되어있지 않아 NullPointerException이 발생
=======
		List<Integer> list = new ArrayList();	//list 선언만 있으므로 객체 생성이 되어있지 않아 NullPointerException이 발생
>>>>>>> edfdbf1b8f307cc84e62e8af6d7e2dd67142dc28
		//int도 안됨 참조형인 Integer 
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1);//list.add(1.23456);	//List 선언시 요소의 데이터 타입이 Integer로 설정되어 있으므로 정수만 입려 받을 수 있으므로 데이터타입오류발생
		
		for(int num : list) {
			char ch;
			
			if(num <0) { 	//if문 조건에서 0을 포함하여 음수라고 포현했음으로 0이여도 음수가 발생하고, 0인 경우 정상적으로 처리되어야할 else문이 실행되지않음
				ch ='-';
			} else if (num>0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@");
				continue;	//다음list로 넘어감
			}
			
			// in Math.abs(정수) : 정수의 절대값을 반환
			for(int i=1 ; i<=Math.abs(num); i++) {	//for 반복문의 실행 조건이 해당 숫자를 포함하는 것이 아닌 작을 때까지만 실행하게 되어  해당 숫자의 횟수만큼 부호를 출력해야하는데 1개씩 덜 출력
				System.out.print(ch);
			}
			System.out.println();
		}
		
		
	}

}
