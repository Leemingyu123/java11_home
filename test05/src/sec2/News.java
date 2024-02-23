package sec2;
//Top-Down의 생성자 함수방식
public class News {
	
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String author;
	private int visited;
	
	
	public News(int bno, String title, String uname, String content, String author, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.author = author;
		this.visited = visited;
	}
	
	
	
}
