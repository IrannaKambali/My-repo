package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseover extends BaseClass
{
public static void main(String[] args) {
	driver.get("http://istqb.in/");
	Actions action=new Actions(driver);
	WebElement founModule=driver.findElement(By.xpath("(//a[text()='FOUNDATION'])[1]"));
	action.moveToElement(founModule).perform();;
}
}
