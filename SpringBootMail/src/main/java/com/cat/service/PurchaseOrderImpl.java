package com.cat.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service("service")
public class PurchaseOrderImpl implements IPurchaseOrder
{
	@Value("{spring.mail.username}")
	private String fromEmailId;
	@Autowired
	private JavaMailSender sender;
	
	@Override
	public String purchase(String[] items, double[] prices, String[] toEmail) throws Exception 
	{
		double amount=0.0;
		
		for(double price:prices)
		{
			amount+=price;
		}
		
		String message=Arrays.toString(items)+" with price "+Arrays.toString(prices)+
				" are purchased and total bill amount is "+amount;
		MimeMessage mimeMessage = sender.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		helper.setFrom(fromEmailId);
		helper.setCc(toEmail);
		helper.setSubject("Very Important Notification");
		helper.setText(message);
		helper.setSentDate(new Date());
		helper.addAttachment("baby.jpg", new FileSystemResource("src/main/resources/baby.jpg"));
		sender.send(mimeMessage);
		return message+" about this mail is sent";
	}

}
