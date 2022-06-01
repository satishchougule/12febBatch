package com.Saucedemo.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHomepage 
{
	
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menuButton;
	
	public void menuButton()
	{
		menuButton.click();
	}

	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocart;
	
	public void addtocart()
	{
		 addtocart.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOut;
	
	public void logout()
	{
		logOut.click();
	}
	
	@FindBy(xpath="//a[contains(@class,'shopping_cart_link')]")
	private WebElement cartTrolly;
	
	
	public String trollyCart()
	{
		cartTrolly.click();
		String a=cartTrolly.getText();
		System.out.println(a);
		return a;
		
	}
		
		public PomHomepage (WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver,this);
		}
		
	}
	

