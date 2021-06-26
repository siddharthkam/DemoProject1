package com.oraganizationmanagement.demoproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(BookNotFoundException.class)
	public final ResponseEntity<Object> booknotFoundException(BookNotFoundException bok,WebRequest request)
	{
		BusinessValidation bv=new BusinessValidation("BOK001",bok.getMessage());
		return new ResponseEntity<Object>(bv, HttpStatus.BAD_REQUEST);
	}
}
