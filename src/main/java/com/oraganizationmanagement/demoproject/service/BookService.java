package com.oraganizationmanagement.demoproject.service;

import java.util.List;

import com.oraganizationmanagement.demoproject.model.Book;

public interface BookService {
	
	public Book saveBook(Book b);
	public Book getBook(int id) throws Exception;
	public List<Book> getBookList();
	

}
