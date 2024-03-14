package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>(); //ipInfoList는 ArrayList로 생성해야하지만, null로 대입하였으므로 ipInfoList에 요소를 추가(add) 
		//15,16,19문장은 NullPointerException이 발생한다. List 인터페이스라 생성을 못한다.
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8", "이민규"));	//IPInfo 클래스에서 매개변수 하나를 전달받는 생성자(Constructor)는 없으므로 객체 생성 불가능
		//IPInfo 클래스에 매개 변수 ip만 받는 생성자를 추가한다.
		//IPInfo 객체 생성시 ip와 user의 매개변수 값을 모두 넣는다.
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.println("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0 ; i<ipInfoList.size();i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) {	//ipInfoList.get(i)는 특정번째의 IPInfo 클래스의 객체이고, ip는 String변수이므로 
				System.out.println(ipInfoList.get(i).toString());
				break;
			}//일치하는 ip 사용자가 없는경우의 메시지 출력이 없음
		}

	
		System.out.println("일치하는 ip사용자가 없습니다.");	//for문 밖으로 나와서 어떤 값을 입력하든 출력되도록 되어있다.
	}

}
