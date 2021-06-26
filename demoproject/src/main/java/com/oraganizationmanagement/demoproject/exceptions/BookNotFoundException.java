package com.oraganizationmanagement.demoproject.exceptions;

public class BookNotFoundException  extends RuntimeException
{
	public BookNotFoundException() {
	   super("Enter book not found");
	}
	
}
