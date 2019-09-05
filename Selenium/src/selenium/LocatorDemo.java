package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.findElement(By.cssSelector("#menu_download > a")).click();
		String xp="//td[text()='Java']/following-sibling::td/a[text()='Download']";
		driver.findElement(By.xpath(xp)).click();
		
		
		
		
}
}
