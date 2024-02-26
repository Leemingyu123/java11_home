package sec2;

public class Subway {
	int no; //몇호선
	String staion; //역이름
	int cnt;//승객수
	int money;//요금

	//지하철 노선을 매개변수로 받는 생성자 함수
	public Subway (int no) {
		this.no = no;
	}
	//지하철 승객이 탑승하면 생기는 필드의 값 변환
	public void take (int money) {
		this.money += money;
		cnt++;
	}
	//현재 지하철 정보 출력
	public void show() {
		System.out.println("지하철 "+no+"호선, "+"수입 :"+money+"승객수 :"+cnt);
	}
	
}
