package com.cat.SpringMongoDb.generator;

import java.util.UUID;

public class IdGenerator 
{
	public static String generateID()
	{
		return UUID.randomUUID().toString().replace("-", "").substring(0,10);
	}
}
