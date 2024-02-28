package sec1;

public class Abstractex1  {

	public static void main(String[] args) {
		//User u1 = new User(); User클래스는 추상클래스이므로 추상메소드의 구현내용이 기술되어있지 않아 객체를 생성할수없다.
		User u1;
		u1= new Member();
		u1.setIp("192.168.1.152");
		u1.setPort(80);
		u1.connect();
		
		u1 = new Steff();
		u1.connect();
		
		Member u2;
		u2 = new Member();
		u2.setIp("192.168.0.121");
		u2.setPort(80);
		u2.setId("kkt09072");
		u2.setPw("1234");
		u2.connect();
		
		Steff u3;
		u3 = new Steff();
		u3.setIp("192.168.0.164");
		u3.setPort(80);
		u3.setLevel(2);
		u3.setPart("기술부");
		u3.setName("김기태");
		u3.connect();
		
	}

}
