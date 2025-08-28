package com.cat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestApiExceptionHandler 
{
	@ExceptionHandler(value=StockNotfoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(StockNotfoundException se)
	{
		return new ResponseEntity<String>(se.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
