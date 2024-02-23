package sec2;

public class Board {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String author;
	private int visited;
	
	
	/* 우클릭 sourse- generate constructor using field
	public Board(int bno, String title, String uname, String content, String author, int visited) {
		super();
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.author = author;
		this.visited = visited;
	}*/
	//생성자 overload
	public Board() {} //원래는 생략되있음
	public Board(int bno) {  // 매개변수가 있는 걸 쓰려면 위에를 생략할수없다.
		this.bno = bno;
	}
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	public Board(int bno, String title, String uname) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	public Board(int bno, String title, String uname, String content) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
	}
	public Board(int bno, String title, String uname, String content, String author) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.author = author;
	}
	public Board(int bno, String title, String uname, String content, String author, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.author = author;
		this.visited = visited;
	}

	
	// 우클릭 sourse-getter setter
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	
	//우클릭 sourse-tostring
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", author="
				+ author + ", visited=" + visited + "]";
	}
	
	
	
	
	
}
