package com.cat.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cat.error.ErrorDetails;
import com.cat.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristErrorControllerAdvice 
{
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristNotFound(TouristNotFoundException te)
	{
		System.out.println("control is TouristExceptionHandler method");
		ErrorDetails details= new ErrorDetails(LocalDateTime.now(),te.getMessage(),"404-Found");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
	}
}
