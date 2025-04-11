package com.cat.exception;


import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo 
{
	private String code;
	private String info;
	private LocalDateTime dateTime;
}
