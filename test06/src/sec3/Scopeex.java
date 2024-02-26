package sec3;
//특정 변수가 영향을 미치는 범위 : scope
public class Scopeex {
	int a = 10; //전역 변수 : 클래스 전체에서 인지되는 변수이지만, 특정 메소드(함수)내에서는 인지못함.
	static int b = 100;//클래스 변수 : 클래스 전체에서 인지되고, 특정 메소드(함수)내에서도 인지함.=Global scope
	
	public static void main(String[] args) {	
		int a = 20;// 지역변수 : 특정 매소드(함수)내에서 선언되어 활용되는 변수, 해당함수블록을 벗어나면 인지못함.=Local scope
		System.out.println("지역변수 a = "+a);
		run();
		run(30);
	}
	
	public static void run() {
		int c = 40; //지역변수
		//System.out.println("전역변수 a = "+a);
		System.out.println("클래스 변수b= "+b);
	}
	
	public static void run(int a) {//매개변수 :메소드(함수) 정의시 괄호안에 있는변수로 호출시 지정된 값을 저장.=Local scope
		System.out.println("매개변수 a= "+a);
	}
}
