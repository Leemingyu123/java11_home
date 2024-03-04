package sec1;

public class Exam1 {

	public static void main(String[] args) {
		int a = 1004;
		int b = 1004;
		System.out.println(a==b); 		// 단순 정수의 값 비교
		String s1 = "김기태";		//String은 기본형x, 참조형x
		String s2 = "김기태";
		System.out.println(s1==s2);		//***틀린*** 문자열의 값 비교******
		System.out.println(s1.equals(s2));		//***맞는*** 문자열의 값 비교****** --> String 클래스 연산을 해야 하므로 반드시 equals 메소드를 써야함
		
		Integer c = 1004;  //Integer c = new Integer(1004);		//참조형
		Integer d = 1004;	//Integer d = new Integer(1004);	//참조형
		
		System.out.println(a==c);	//기본형과 참조형의 비교는 값비교
		System.out.println(c==d);	// 참조형과 참조형으 비교는 주소를 비교
		System.out.println(c.equals(d));	//참조형과 참조형의 비교는 equals를 사용한다.

	}

}
