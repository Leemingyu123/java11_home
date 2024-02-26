package sec3;

public class Peopleex {

	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 200; //People.selNum = 200와 동일, 클래스변수 ==정적필드 == 공유데이터
		p1.name = "이민규"; //인스턴스 변수 == 동적필드
		p1.age = 31;
		p1.addr = "부천시 중동";
			
		People p2 = new People();
		p2.selNum = 300; //People.selNum = 300와 동일
		p2.name = "문성준";
		p2.age = 40;
		p2.addr = "부천시 상동";
		
		p1.selNum = 400; //static - 공유해버림 : 객체와 관계없이 메모리가 공유됨.
		
		System.out.println(p1.selNum+", "+p1.name);
		System.out.println(p2.selNum+", "+p2.name);

		p1.print1();
		p2.print1();
		
		p1.print2(); // People.Print2();와 동일
		p2.print2(); // People.Print2();와 동일
		
		//정적(static) 요소 : static으로 선언된 필드 또는 메소드
		//정적(static) 메소드 : 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소드
		System.out.println("----(정적메소드 == 클래스 메소드)----");
		People.print2();
		People.selNum = 500;
		p1.print1();
		p2.print2();
		
	}

}
