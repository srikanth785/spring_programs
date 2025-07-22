package com.cat.pojo;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Course 
{
	private Integer cid;
	private String cname;
	private Double price;
}
