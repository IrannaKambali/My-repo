package selenium;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	System.out.println("Titel of the page="+driver.getTitle());
	System.out.println("Url is :--->"+driver.getCurrentUrl());
	TakesScreenshot ts=(TakesScreenshot) driver;
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	System.out.println(srcFile);
	File destFile=new File("E:\\java class\\Selenium\\screenshot");
	driver.close();
	
}
}
