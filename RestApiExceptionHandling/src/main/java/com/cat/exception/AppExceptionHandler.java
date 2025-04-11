package com.cat.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler 
{
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handlingUserException(Exception e)
	{
		ErrorInfo info=new ErrorInfo();
		
		info.setCode("T004");
		info.setInfo(e.getMessage());
		info.setDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> handlingException(Exception e)
	{
		ErrorInfo info=new ErrorInfo();
		
		info.setCode("T001");
		info.setInfo(e.getMessage());
		info.setDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
