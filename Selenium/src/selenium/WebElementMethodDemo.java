package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class WebElementMethodDemo extends BaseClass
{
public static void main(String[] args) throws InterruptedException {
	  driver.get("http://demo.actitime.com/login.do");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 
	  String xp="//span[contains(text(),'invalid.')]";
	  //verify the error msg displayed
	  
	  WebElement errMsgObj=driver.findElement(By.xpath(xp));
	  boolean displayed=errMsgObj.isDisplayed();//verify the error msg text is correct
	  if(displayed) 
	  {
		 
		  String actErrText=errMsgObj.getText();
		  if(actErrText.equals("Username or Password is invalid. Please try again."))
		  
			  System.out.println("valid error msg");
		  
			  
		  else
		 
			  System.out.println("Invalid error msg");
		  }
		  
	  
	  else
	  {
		  System.out.println("Message not displayed");
	  }
  
}
}
