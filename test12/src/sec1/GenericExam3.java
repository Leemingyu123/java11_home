package sec1;

interface Matrial {//인터페이스 선언만/ 구현기능x
	void doPrinting();
}

class Powder implements Matrial{

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다.");
	}
	public String toString() {
		return "Powder";
	}
}

class Plastic implements Matrial{

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");	
	}
	public String toString() {
		return "Plastic";
	}
}

//<T extends Matrial> => 제네릭의 한정자
class GenericPrint<T extends Matrial>{ //Matrial 인터페이스의 자식클래스
	private T matrial;

	public GenericPrint(T matrial) {
		super();
		this.matrial = matrial;
	}

	public T getMatrial() {
		return matrial;
	}

	public void setMatrial(T matrial) {
		this.matrial = matrial;
	}
	
}

public class GenericExam3 {

	public static void main(String[] args) {
		Plastic p1 = new Plastic();
		
		GenericPrint<Plastic> g1 = new GenericPrint<>(p1);
		
		

	}

}
