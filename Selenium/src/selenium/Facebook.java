package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.facebook.com");
	
}
}
