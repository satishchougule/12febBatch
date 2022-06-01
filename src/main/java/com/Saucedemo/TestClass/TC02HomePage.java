package com.Saucedemo.TestClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Saucedemo.Pom.LoginPagePom;
import com.Saucedemo.Pom.PomHomepage;

public class TC02HomePage 
{
	public static void main(String[] args) throws InterruptedException 
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
	
	PomHomepage hp=new PomHomepage (driver);
    hp.addtocart();
    Thread.sleep(3000);
    System.out.println("add to cart");
    hp.trollyCart();
    Thread.sleep(3000);
    System.out.println("product show in the cart");
    hp.menuButton();
    Thread.sleep(3000);
    System.out.println("click on menubutton");
    hp.logout();
    Thread.sleep(3000);
    System.out.println("logout");

    
	String expectedresult="1";
	String actual=hp.trollyCart();
	
	if(expectedresult.equals(actual))
	{
		System.out.println("test is passed");
	}
	
	else
	{
		System.out.println("test is failed");
	}
	
	System.out.println("end of program");
	
	driver.quit();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}