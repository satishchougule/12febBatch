package com.Saucedemo.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(com.Saucedemo.Utilityclass.Listnearclass.class)
public class SampleClass 
{
	
	public WebDriver driver;
	
//	@Test
//	
//	public void verifyLoginUrl()
//	{
//		Assert.assertTrue(true);
//	}
//	
//	
//	@Test
//	public void verifyLoginTitle()
//	{
//		Assert.assertTrue(false);
//	}
//	
	
	@Test
	public void verifytitle()
	{
	   
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	     Assert.assertTrue(false);
		
		
		
	}
	
	
	
	

}
