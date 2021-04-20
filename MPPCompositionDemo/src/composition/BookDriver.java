package composition;

import java.util.ArrayList;
import java.util.List;

public class BookDriver {
	
	public static void main(String[] args) {
		Book book1=new Book("Magic of Thinking Big","Schwartz");
		Book book2=new Book("The Supreme Awakening", "Maharishi");
		
		List<Book> bks=new ArrayList<>();
		bks.add(book1);
		bks.add(book2);
		
		Library books=new Library(bks);
		
		List<Book> allBooks=books.getAllBooks();
		
		for(Book b:allBooks) {
			System.out.println(b.title+"->"+b.author+"\n");
		}
	} 

}
