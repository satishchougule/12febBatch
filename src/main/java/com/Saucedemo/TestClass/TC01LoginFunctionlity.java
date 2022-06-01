package com.Saucedemo.TestClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Saucedemo.Pom.LoginPagePom;

public class TC01LoginFunctionlity 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\cromefdoucment\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	System.out.println("open the browser");
	driver.get("https://www.saucedemo.com/");
	System.out.println("open the url");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("maximize the window");
	
	
	LoginPagePom lp= new LoginPagePom(driver);
	
	lp.sendUserame();
	System.out.println("enter the username");
	lp.sendPassword();
	System.out.println("enter the password");
	lp.clickLoginButton();
	System.out.println("click on loginbutton");
	
	String expectedtitle="Swag Labs";
	String actualtitle=driver.getTitle();
	System.out.println( actualtitle);
	
	if(expectedtitle.equals(actualtitle))
	
	{
		System.out.println("test case is passed");
	}
	
	else
	{
		System.out.println("test is failed");
	}
	
	
	System.out.println("end of program");
	
	driver.quit();
	System.out.println("browser is closed");
	
	
	
}
}