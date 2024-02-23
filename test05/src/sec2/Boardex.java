package sec2;

public class Boardex {

	public static void main(String[] args) {
		Board b1 = new Board();
		b1.setBno(1);
		b1.setTitle("자바코딩~!");
		b1.setUname("javabcd");
		
		Board  b2 = new Board(101);
		b2.setTitle("평가대비 하야지");
		b2.setUname("lee");
		
		Board  b3 = new Board(102, "오늘은 코딩불금~!");
		b3.setUname("leeming");
		
		Board  b4 = new Board(103, "타이틀", "유네임");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		
		Notice n1= new Notice (101, "주말은 코딩", "alsrb882", 
				"자바내용", "이민규", 0);
		System.out.println(n1.toString());
	}

}
