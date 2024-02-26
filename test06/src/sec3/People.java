package sec3;

public class People {
	//public int selNum= 100; //고유번호
	public static int selNum= 100; //static-정적 필드(공유데이터)
	public String name; //이름
	public int age; //나이
	public String addr; //주소
	
	public void print1() {
		System.out.println("selNum : "+this.selNum);
		System.out.println("name : "+this.name);
	}
	public static void print2() {//static메소드 에서는 this. 을 못쓴다
		System.out.println("Name : 이민규");
		System.out.println("Age : 31");
	}

}
