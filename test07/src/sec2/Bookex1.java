package sec2;

public class Bookex1 {

	public static void main(String[] args) {
		//100개의 Book 배열선언
		Book[] book = new Book[100];
		/*
		for(int i=0;i<5;i++) {
			book [i] = new Book("책 제목"+i, "저자"+i);
		}
*/
		book[0] = new Book("자바 프로그래밍 입문", "박은종");
		book[1] = new Book("HTML/CSS", "전은철");
		book[2] = new Book("바다", "이민규");
		book[3] = new Book("산", "박준현");
		book[4] = new Book("캠핑", "문성준");
		
		for(int i=0;i<5;i++) {
			System.out.println(book[i].toString());
		}
		
	}

}
