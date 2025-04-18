package com.cat.config;

import org.springframework.batch.item.ItemProcessor;

import com.cat.entity.Health;

public class HealthProcessor implements ItemProcessor<Health, Health>
{
	public Health process(Health item)
	{
		//logic
		return item;
	}
}
