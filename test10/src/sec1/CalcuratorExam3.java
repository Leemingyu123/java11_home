package sec1;

public class CalcuratorExam3 {

	public static void main(String[] args) {
		Repeator rep1;
		int num1 = 100;
		int num2 = 5;
		//rep1 = new Calcurator();  Repeator는 Calcurator의 자식클래스이므로 오류
		//자식클래스로 선언된 인스턴스(객체)는 부모 생성자로 생성할 수 없음.
		
		//rep1 = new Repeator(); Repeator는 추상클래스 이므로 내부에 추상메소드가 존재하고있어
		//구현내용이 없으므로 생성할수 없음
		
		rep1 = new Arithmatic();
	
		//rep1.print();  re1은 Repeator로 선언되어 있으므로 Repeator에는 print();가 선언되어있지않아 불가.
		System.out.println(rep1.PI);
		System.out.println(rep1.add(num1, num2));
		System.out.println(rep1.subtract(num1, num2));
		System.out.println(rep1.multiply(num1, num2));
		System.out.println(rep1.divide(num1, num2));
		System.out.println(rep1.power(num1, num2));
	}

}
