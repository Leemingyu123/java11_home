package sec1;
class Outer3 {	//외부클래스
	//익명의 내부 크래스를 선언시에는 Runnable 로 구현해야 한다.
	Runnable getRunnable(int i) {	//Runnable은 인터페이스 이므로 인스턴스 생성시 기본 메소드인 run() 메소드의 구현 내용을 기술하여 생성해야한다.
		int num = 100;	//지역변수
		
		return new Runnable() {
			@Override
			public void run() {
				//int i;	=> 매개변수로 이미 상단에 i가 있기 때문에 중복되어 오류발생
				//int num; => 지역변수로 이미 상단에 num이 존재하기때문에 중복되어 오류발생
				System.out.println(i);	//i=> 매개변수
				System.out.println(num);	//num => 지역 변수
			
			}
			
		};
	}
	//익명의 실행 인스턴스(객체)를 Runnable 생성
	//Runnable runner = new Runnable();	//Runnable은 인터페이스오류남

}
public class AnonymousInnerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
