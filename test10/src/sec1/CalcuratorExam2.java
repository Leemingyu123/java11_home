package sec1;

public class CalcuratorExam2 {
	public static void main(String [] args) {
		Calcurator cal1;
		int num1 = 100;
		int num2 = 3;
		/*구현내용이 기술되어 있지 않으므로 추상체로는 객체를 생성할 수 없음
		Calcurator cal1 = Calcurator();
		cal1 = new Repeator();
		
		Calcurator cal1 = Calcurator(){
			구현내용
		}
		*/
		cal1 = new Arithmatic();
		//cal1 은 Calurator로 선언 되어 있으므로 Calcurator에 print(); 메소드가 없어 실행불가
		//cal1.print();
		System.out.println(cal1.PI);
		System.out.println(cal1.add(num1, num2));
		System.out.println(cal1.subtract(num1, num2));
		System.out.println(cal1.multiply(num1, num2));
		System.out.println(cal1.divide(num1, num2));
		//System.out.println(cal1.power(num1, num2)); 도 마찬가지
		
		//그러므로 조상 인터페이스로 선언되어 자식 클래스의 생성자로 생성된 인스턴스(객체)는
		//조상 인터페이스의 선언된 메소드만 사용할 수 있으며, 실행되는 내용은 자식클래스에서 기술한 내용대로 실행됨
		
		//인터페이스 => 클래스 : implements(구체화)
		//클래스 => 클래스 : extends(확장)
		//인터페이스 => 인터페이스 : extends(확장)
		
		
	}

}
