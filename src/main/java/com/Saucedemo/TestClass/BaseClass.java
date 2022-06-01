package com.Saucedemo.TestClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Saucedemo.Pom.LoginPagePom;
import com.Saucedemo.Pom.PomHomepage;

public class BaseClass
{
	
    WebDriver driver;
    Logger log;
   
	@Parameters("browserName")
	@BeforeMethod()
	public void setup(String browserName) throws InterruptedException
	{
		if(browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver new\\chromedriver.exe");
	driver = new ChromeDriver();
	log=Logger.getLogger("application.log");
	PropertyConfigurator.configure("log4j.properties");
	
	log.info("open the browser");
	driver.get("https://www.saucedemo.com/");

     log.info("open the url");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	else
	{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver\\geckodriver.exe");
	    WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
	
    LoginPagePom lp=new LoginPagePom (driver);
	lp.sendUserame();
	lp.sendPassword();
	lp.clickLoginButton();
	
	PomHomepage hp=new PomHomepage (driver);
    hp.addtocart();
    Thread.sleep(3000);
    log.info("add to cart");
    hp.trollyCart();
    Thread.sleep(3000);
    log.info("product show in the cart");
    hp.menuButton();
    Thread.sleep(3000);
    log.info("click on menubutton");
    hp.logout();
    Thread.sleep(3000);
    log.info("logout");
	
	}
	@AfterMethod
	public void teardown()
	{
	
		//driver.quit();
	
	
	}

}
