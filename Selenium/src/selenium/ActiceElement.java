package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;

public class ActiceElement extends BaseClass 
{
	public static void main(String[] args) {
		driver.get("http://www.gmail.com");
		driver.findElement(By.cssSelector("#identifierId"));
		TargetLocator t1=driver.switchTo();
		t1.activeElement().sendKeys("iranna.s.kambali@gmail.com");
		
		
		
		
		
	}


}
