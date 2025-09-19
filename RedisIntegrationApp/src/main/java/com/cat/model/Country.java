package com.cat.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Country implements Serializable
{
	private Integer no;
	
	private String name;
	
	private String countryCode;
	
}
