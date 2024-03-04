package sec1;

public class Studentex1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = new Student();
		
		
		su2=su1; // 얕은 복제
		Student su3 = (Student) su1.clone();
		
		System.out.println(su1.getClass().toString());
		System.out.println(su1 instanceof Student);
		System.out.println(su1.toString());
		System.out.println(su1.equals(su2));
		System.out.println(su1.hashCode());
		//su3와su1의 주소가 달라 false로 출력
		//Student 클래스에 equals를 모든 맴버 필드(변수)에 대해 비교하는 오버라이딩을 해주면, 값 비교가 가능해진다.
		System.out.println(su3.equals(su1));
	


		
	}

}
