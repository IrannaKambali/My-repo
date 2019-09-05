package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http//:www.google.com");
		System.out.println("Titel of fb ="+driver.getTitle());
		System.out.println("Titel of fb ="+driver.getCurrentUrl());
		driver.close();

		Navigation nav=driver.navigate();
		nav.to("http//:www.google.com");
		
		//added lines
	}

}
