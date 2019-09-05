package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActiTimeNew extends BaseClass
{
public static void main(String[] args) throws AWTException 
{
	driver.get("http://demo.actitime.com/login.do");
	Actions action =new Actions(driver);
	Robot r=new Robot();
	WebElement incLink=driver.findElement(By.xpath("//*[@id=\"copyRight\"]/nobr/a"));
	action.contextClick(incLink).perform();
	//r.keyPress(KeyEvent.VK_G);
	driver.findElement(By.id("username")).sendKeys("admin");
	action.doubleClick(driver.findElement(By.id("username"))).perform();
	r.keyPress(KeyEvent.VK_BACK_SPACE);
	r.keyRelease(KeyEvent.VK_BACK_SPACE);
	
	

	
	
	
}
}
