package com.Saucedemo.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPagePom 
{
	
	
	//1. WebDriver declared
	
	WebDriver driver;
	
	
	//2.find the elements by @FindBY
	
	@FindBy(xpath="//input[@id='user-name']")
	 private WebElement username;
	
	//action on element
	
	public void sendUserame()
	
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();
		
	}
	

	
	
	public LoginPagePom(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	
	}
	
	}

