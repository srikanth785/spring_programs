package com.cat.pojo;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
public class Book extends RepresentationModel
{
	
	private String bid;
	private String bookName;
	private String authorName;
	private Double bookPrice;
	
	public Book(String bid, String bookName, String authorName, Double bookPrice) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}
}
