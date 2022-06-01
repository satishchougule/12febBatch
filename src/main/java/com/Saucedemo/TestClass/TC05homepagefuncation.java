package com.Saucedemo.TestClass;



import org.testng.annotations.Test;

import com.Saucedemo.Pom.PomHomepage;

public class TC05homepagefuncation extends BaseClass

{
	
	@Test
	    public void homepagef() throws InterruptedException 
	{
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

}
}
