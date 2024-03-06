package sec1;

public class Notebook implements Computer{

	@Override
	public void display() {
		System.out.println("노트북의 기본 해상도 : 1080 x 960");

	}

	@Override
	public void typing() {
		System.out.println("노트북의 문자표에서 해당 글쇠를 터치합니다.");

	}

	@Override
	public void power(boolean sw) {
		if (sw) System.out.println("노트북의 전원을 켭니다.");
		else System.out.println("노트북의 전원을 끕니다.");
	}
	//오버로딩된 power 메소드
	public void power(String model, boolean sw) {
		
	}

}
