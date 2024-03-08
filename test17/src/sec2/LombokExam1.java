package sec2;

public class LombokExam1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("kkt");
		mem1.setPw("1234");
		mem1.setPoint(100);
		
		Board a = new Board();
		a.setBno(1);
		a.setContent("sdfasf");
		a.setViewCnt(856);
		System.out.println(a);
		//출력은 안됨
	}

}

