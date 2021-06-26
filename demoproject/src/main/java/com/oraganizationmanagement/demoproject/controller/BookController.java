package com.oraganizationmanagement.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oraganizationmanagement.demoproject.exceptions.BookNotFoundException;
import com.oraganizationmanagement.demoproject.model.Book;
import com.oraganizationmanagement.demoproject.service.BookServiceImpl;

@RestController
public class BookController {

	@Autowired
	BookServiceImpl bookService;

	@PostMapping("/Book")
	public ResponseEntity<Book> addbook(@RequestBody Book b) {
		Book b1 = bookService.saveBook(b);
		HttpHeaders header = new HttpHeaders();
		header.add("FISRT", "1");
		return new ResponseEntity<>(b1, header, HttpStatus.OK);

	}

	@GetMapping("/Books")
	public ResponseEntity<List<Book>> getbook() {
		List<Book> booklist = bookService.getBookList();
		HttpHeaders header = new HttpHeaders();
		header.add("List", "1");
		return new ResponseEntity<>(booklist, header, HttpStatus.OK);
	}

	@GetMapping("/BooksBYID/{id}")
	public ResponseEntity<Book> getbookbyId(@PathVariable("id") String id) throws BookNotFoundException {
		System.out.println("id   " + id);

		Book book = null;

		try {
			System.out.println("SIDDHARTH  :");
			book = bookService.getBook(Integer.parseInt(id));
			HttpHeaders header = new HttpHeaders();
			header.add("List", "1");
			if(book.getAuthor()==null)
			{
				throw new BookNotFoundException();
				
			}
			return new ResponseEntity<>(book, header, HttpStatus.OK);

		} catch (Exception e) {
			System.out.println("Hiiii ONE");
			e.printStackTrace();
			throw new BookNotFoundException();
		}

	}

	@GetMapping("/greet")
	public String Test() {
		return "Welcome to Our Application";
	}

}
