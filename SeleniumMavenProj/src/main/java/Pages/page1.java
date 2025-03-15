package Pages;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Browsers.browser;
import Browsers.utility;
import Locators.page1objects;

public class page1 extends browser{
	
	
	//Method for getting the actual title
	public static String Title()
	{
		return driver.getTitle();
	}
	
	//Entering user name method
	
	public static void enterusername(String str) 
	{
		try 
		{	
				page1objects.username().sendKeys(str);
		}
		catch(Exception E)
		{
			System.out.println("Username :"+E);
		}
		
	}
	
	//Entering password method
		
		public static void enterpassword(String str) 
		{
			try
			{
				page1objects.password().sendKeys(str);
			}
			catch(Exception E)
			{
				System.out.println("Password :"+E);
			}
			
			
		}
	
	//clicking method
	
	public static void click() 
	{
		try
		{
			page1objects.login().click();
		}
		catch(Exception E)
		{
			System.out.println("Click :"+E);
		}
	}
		
	

}


