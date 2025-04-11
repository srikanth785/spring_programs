package com.cat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.pojo.Book;

@RestController
@RequestMapping("/api/books")
public class BookController 
{
	@GetMapping("/getbook/{bid}")
	public ResponseEntity<Book> getBookInfo(@PathVariable("bid")String bid)
	{
		Book book=new Book("T101", "SpringBoot", "RodJonson", 454.4);
		
		Link link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.
				methodOn(BookController.class).getBooksInfo()).withRel("getallbooks");
		System.out.println("Before Adding link");
		book.add(link);
		System.out.println("Link is fine");
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@GetMapping("/getallbooks")
	public List<Book> getBooksInfo()
	{
		System.out.println("control in get all books ");
		List<Book> list=new ArrayList<>();
		list.add(new Book("T101", "SpringBoot", "RodJonson", 454.4));
		list.add(new Book("T102", "Hibernate", "Gavin king", 400.5));
		list.add(new Book("T103", "Java", "RodJonson", 399.4));
		
		return list;
	}
}
