package com.Saucedemo.TestClass;




import org.testng.Assert;
import org.testng.annotations.Test;

import com.Saucedemo.Pom.PomHomepage;

public class TC04loginfuctionclass extends  BaseClass
{
	
//	@Test(priority=1)
//	public void LoginFucationlity()
//	{
//		String expectedtitle="Swag Labs";
//		String actualtitle=driver.getTitle();
//		System.out.println( actualtitle);
//		
//		
////		if(expectedtitle.equals(actualtitle))
////		
////		{
////			System.out.println("test case is passed");
////		}
////		
////		else
////		{
////			
////		System.out.println("test is failed");
////		}
//	
//	Assert.assertEquals(actualtitle, expectedtitle);
//	
//	
//	}
//	
//	@Test
//	
//	public void homepagefuncationlity()
//	{
//		
//		 PomHomepage hp=new PomHomepage (driver);
//		    String expectedresult="1";
//			String actual=hp.trollyCart();
//			
//			Assert.assertEquals(actual, expectedresult);
//			
////			if(expectedresult.equals(actual))
////			{
////				System.out.println("test is passed");
////			}
////			
////			else
////			{
////				System.out.println("test is failed");
////			}
////			
////			System.out.println("end of program");
	
	/////////dependsonmethod keyword
	@Test(priority=1)
	public void LoginFucationlity()
	{
		String expectedtitle="Swag Labs";
		String actualtitle=driver.getTitle();
		System.out.println( actualtitle);
		
		
//		if(expectedtitle.equals(actualtitle))
//		
//		{
//			System.out.println("test case is passed");
//		}
//		
//		else
//		{
//			
//		System.out.println("test is failed");
//		}
	
	Assert.assertEquals(actualtitle, expectedtitle);
	
	
	}
	
	@Test(dependsOnMethods={"LoginFucationlity"},priority=2)
	
	public void homepagefuncationlity()
	{
		
		 PomHomepage hp=new PomHomepage (driver);
		    String expectedresult="1";
			String actual=hp.trollyCart();
			
			Assert.assertEquals(actual, expectedresult);
			
//			if(expectedresult.equals(actual))
//			{
//				System.out.println("test is passed");
//			}
//			
//			else
//			{
//				System.out.println("test is failed");
//			}
//			
//			S

		}
		

	}



