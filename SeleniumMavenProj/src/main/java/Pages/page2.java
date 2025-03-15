package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Browsers.browser;
import Locators.page2object;

public class page2 extends browser {
	
	
		public static String Username()
		{
			return page2object.username().getText();
		}
	
		//clicking method
	
		public static void optionclick(String str) 
		{
			
			try{
				List<WebElement> list=page2object.menuelements();
				for(WebElement e:list)
				{
					if(e.getText().equalsIgnoreCase(str))
					{	e.click();
						break; }
				}
				}
			
			catch(Exception E)
			{
				System.out.println("Click :"+E);
			}	
		}
		
		public static String MenuName()
		{
			return page2object.menuName().getText();
		}
			

}

