package com.framework;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Demo1 
{
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2");
		Assert.fail();
	}
}
