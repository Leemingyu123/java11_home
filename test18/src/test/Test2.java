package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//이름목록의 작성 : 키보드로 이름을 입력받아 이름목록(nameList)에 추가하되,입력값이 clear면, 이름목록 초기화, 입력값이 exit면 반복루프를 종료, 기존값과 중복된 이름이 있으면 이미 존재하는 이름입니다.출력하고 계속 입력모드로 진행되며, 입력값에 대한 이름이 존재하지 않으면 이름목록에 이름을 추가하고 반복이 종료되면, 이름목록을 출력한다.
public class Test2 {
	public static void main(String[]args) {
		//.contains() 특정문자가 포함되어있는지아닌지 String, 객체비교할때
		//getUser().equals(str) 문자열과 문자비교 여러줄 출력됨
			//boolean sw = false; sw=true;
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		while(true) {
			System.out.print("추가할 이름을 입력하세요 : ");
			String name = sc.next();
			
			if(name.equals("clear")) {//if(name == "clear") {	//String 비교는 ==가 아니고 equals()를 써야함.
				//continue; 			//continue 구문이 실행해야할 다른 문장보다 앞서 있어서 continue 구문 이후의 문장이 실행되지 않는다.
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue;
			}
			if(name.equals("exit")) {	//String 비교는 ==가 아니고 equals()를 써야함.
				System.out.println("<<입력 종료>>");
				break; //return ;		//exit가 입력될 경우 아래 반복 출력 문장을  실행하지 못하고, main 함수(메소드)의 밖으로 탈출해버린다.
			}//break를 걸어야 while구문을 빠져나감
			
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다.>");
			} else {
				nameList.add(name);	//이름목록(nameList)에 이름을 추가하는 구현코드의 누락으로 인해 추가하지 못함.
				System.out.println(name +" 추가 완료.");
			}
		}
		
		for(String name : nameList) {
			System.out.println(name);
		}
	}

}
