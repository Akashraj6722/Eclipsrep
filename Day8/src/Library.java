
public class Library {
	
	String name;
	String bookName;
	String authorName;
	String bookId;
	
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	
	public Library(String name, String bookName, String authorName, String bookId) {
		super();
		this.name = name;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookId = bookId;
	}
	public Library() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Library [name=" + name + ", bookName=" + bookName + ", authorName=" + authorName + ", bookId=" + bookId
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
