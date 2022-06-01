package com.Saucedemo.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice5 
{
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("login test");
	Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"loginTest"},priority=1)
	public void singleproduct()
	{
		System.out.println("single product test");
	}
	
	
	
}
