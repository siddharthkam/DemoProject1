package com.oraganizationmanagement.demoproject.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraganizationmanagement.demoproject.model.Book;
import com.oraganizationmanagement.demoproject.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository repository;

	@Override
	public Book saveBook(Book b) {
		return repository.save(b);
	}

	@Override
	public Book getBook(int id){
		
		
		Book B=null;
		return repository.getById(id);
				
		/*Book B=null;
		try
		{
		System.out.println(" ID "+id);
		return repository.getById(id);
		}
		catch (Exception e) {
			System.out.println(" Exception "+e);
			throw new Exception();
		}
		return B;*/
		
	}

	@Override
	public List<Book> getBookList() {
	  return repository.findAll();
	}

	
	
	

}
