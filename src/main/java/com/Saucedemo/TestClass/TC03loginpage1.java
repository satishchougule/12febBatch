package com.Saucedemo.TestClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Saucedemo.Pom.LoginPagePom;

public class TC03loginpage1 
{
	WebDriver driver;
	
	@BeforeMethod()
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\cromefdoucment\\chromedriver.exe\\");
	driver = new ChromeDriver();
	System.out.println("open the browser");
	driver.get("https://www.saucedemo.com/");
	System.out.println("open the url");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("maximize the window");
	
	LoginPagePom lp=new LoginPagePom (driver);
	lp.sendUserame();
	lp.sendPassword();
	lp.clickLoginButton();
	
	}
	
	@Test
	public void LoginFucationlity()
	{
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

	}
	
	@AfterMethod
	public void teardown()
	{
	
		//driver.quit();
		
	
}

}
