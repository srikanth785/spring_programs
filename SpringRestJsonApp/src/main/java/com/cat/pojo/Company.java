package com.cat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company 
{
	private String cname;
	private String ctype;
	private String caddress;
	private Integer size;
}
