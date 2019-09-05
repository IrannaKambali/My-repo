package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestionListBox extends BaseClass
{
public static void main(String[] args) throws InterruptedException
{
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Goa Beach");
	Thread.sleep(2000);
	List<WebElement> allSuggestions = driver.findElements(By.xpath("//*[contains(text(),'goa beach')]"));
	Thread.sleep(2000);
	int count = allSuggestions.size();
	System.out.println("Number of Suggestions in Dropdownlist "+count);
	String actualSuggestion = "goa beach photos";
	for(WebElement options : allSuggestions)
	{
		String text = options.getText();
		System.out.println(" "+text);
		if(text.equals("goa beach photos")) {
			options.click();
			break;
			
		}
	}
	
	
	
	
}
}
