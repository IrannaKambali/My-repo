package selenium;

import org.openqa.selenium.By;

public class Frame extends BaseClass
{
public static void main(String[] args)
{
	driver.get("file:///C:/Users/sadyojatha/Desktop/frame2.html");
	//enter admin in to T1 textBox
	driver.switchTo().frame(0);
	driver.findElement(By.id("t1")).sendKeys("admin");
	//switch back to the main page using defaultContent method
	//driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t2")).sendKeys("manager");
}
}
