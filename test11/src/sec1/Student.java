package sec1;

public class Student /*extends Object 가 항상 생략되어 있음. 그러므로 모든 클래스는 Object클래스를 시조 클래스*/ {
	private int sno;
	String name;
	public Student () {}
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
		
		
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//객체 복제시에는 반드시 clone()을 오버라이딩해야함.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student(); // 해당객체 생성
		clone.name = this.name; 		// 새로 생성된 객체에 모든 필드 값을 넘기기
		clone.sno = this.sno;
		
		return clone;
	}
	
	//아래 부분처럼 equals 매서드를 오버라이딩하게 되면, 값 비교가 가능해진다.
	//안하게 되면 주소비교를 한다.
	@Override
	public boolean equals(Object obj) {		//equals 오버라이딩 안해도 됨
		if(obj instanceof Student) {
			Student su1 = (Student) obj;
			if(su1.name == this.name && su1.sno == this.sno) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	
	}


}
