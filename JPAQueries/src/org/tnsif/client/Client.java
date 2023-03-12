package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		
		//to return total no.of books
		System.out.println("Total no.of books: "+service.getCount());
		
		//to return specific book id
		System.out.println("Book with specific Id: "+service.getBookByIds(3));
		
		//price range
		System.out.println("Price range between 300 to 600: "+service.getPrice(300f, 600f));
		
		//author name
		System.out.println("Book with specific author: "+service.getBooksAuthor("Yashwanth"));
		
		//to return all the books
		System.out.println("All books: "+service.getAll());
	}

}