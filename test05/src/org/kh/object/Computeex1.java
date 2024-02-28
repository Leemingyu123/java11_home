package org.kh.object;

public class Computeex1 {

	public static void main(String[] args) {
		Compute01 min = new Compute01();
		min.fnc1();
		
		min.fnc2(5);
		
		int a = min.fnc3();
		System.out.println(a);
		System.out.println(min.fnc3());
		
		String result = min.fnc4(50);
		System.out.println(result);
		
		fnc1();
		fnc2(50);
		System.out.println("리턴값 : "+fnc3());
		System.out.println("원의넓이 : "+fnc4(25));
	}
	//함수(Function) : 정의 호출
	public static void fnc1() {
		System.out.println("반환 x, 매개변수 x");
	}

	public static void fnc2(int a) {
		System.out.println("입력 수 : " +a);
	}
	public static int fnc3() {
		return 500;
	}
	public static double fnc4(int radius) {
		return radius*radius*3.1415f;
	}
	
	
}
