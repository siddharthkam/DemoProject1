package com.oraganizationmanagement.demoproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TBL_BOOK")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book {
	
	@Id
	@GeneratedValue(generator = "TBL_BOK_SEQUENCE",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "TBL_BOK_SEQUENCE",initialValue = 1,allocationSize = 20,sequenceName = "TBL_BOK_SEQUENCE")
	private int bookid;
	@Column(name = "book_Name")
	@Size(min = 2,message = "Book Name Must Be greater than 2")
	private String bookName;
	
    @OneToOne( fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Author author;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", author=" + author + "]";
	}

}
