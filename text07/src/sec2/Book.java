package sec2;

public class Book {
	private String name;
	private String author;
	public Book () {}
	
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getNaem() {
		return name;
	}
	public void setNaem(String naem) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
	
	

}
