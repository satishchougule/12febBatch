package com.Saucedemo.Utilityclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Saucedemo.Practice.SampleClass;

public class Listnearclass implements ITestListener
{
	private WebDriver driver;








	public void onStart(ITestResult result)
	{
		System.out.println("test case is started");
	}
	
	public void onFinish(ITestResult result)
	{
		System.out.println("test case is finished");
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test is successfully passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test is failed and hence we take the the screenshot");
	
	  this.driver=((SampleClass )result.getInstance()).driver;
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	  File destfile=new File ("./screenshot/loginpage.jpg");
	  try 
	  {
		FileHandler.copy(sourcefile, destfile);
	  } 
	  
	  catch (IOException e) 
	  
	  {
        e.printStackTrace();
	
	  }
	
	
	
	
	
	
	}
	
	
	
	
	
	
	

	public void onTestStart(ITestResult result)
	{
		System.out.println("Sanity test is perfromed");
	}
	
	
	
	
	
	
}
