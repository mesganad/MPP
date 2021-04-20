package composition;

import java.util.List;

public class Library {
	private final List<Book> bookList;
	
	public Library( List<Book> bookList) {
		this.bookList=bookList;
	}
	
	public List<Book> getAllBooks(){
		return bookList;
	}

}
