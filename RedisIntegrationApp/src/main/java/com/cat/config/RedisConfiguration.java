package com.cat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.cat.model.Country;

@Configuration
public class RedisConfiguration 
{
	@Bean
	public JedisConnectionFactory jedisConnect()
	{
		JedisConnectionFactory jedisConnect=new JedisConnectionFactory();
		//jedisConnect.setPort(8484);
		//redis server configuration properties
		return jedisConnect;
	}
	
	@Bean
	public RedisTemplate<String, Country> redisTemplate()
	{
		RedisTemplate<String, Country> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnect());
		return redisTemplate;
	}
}
