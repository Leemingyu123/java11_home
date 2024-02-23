package sec1;

public class Book2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.setBno(12);
		b1.setBname("자바입문");
		b1.setPrice(50000);
		b1.setAuthor("김민지");
		b1.setPub("이지스퍼블리싱");
		
		Book b2 = new Book();
		
		b2.setBno(57);
		b2.setBname("책");
		b2.setPrice(58220);
		b2.setAuthor("나");
		b2.setPub("해이");
		
		Book b3 = new Book();
		
		b3.setBno(75);
		b3.setBname("바다");
		b3.setPrice(37600);
		b3.setAuthor("물고기");
		b3.setPub("포세이돈");
		
		Book b4 = new Book();
		b4.print();
		b4.print(b1.getBname(),b1.getPrice(),b1.getAuthor());
		b4.print(b2.getBname(),b2.getPrice(),b2.getAuthor());
		b4.print(b3.getBname(),b3.getPrice(),b3.getAuthor());

	}

}
