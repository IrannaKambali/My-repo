package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static {
		//set the path
		System.setProperty("webdriver.chrome.driver","E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe" );
		System.setProperty("webdriver.gecko.driver","E:\\java class\\Selenium\\Seleniumdriver\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver","E:\\java class\\Selenium\\Seleniumdriver\\IEDriverServer.exe");
	}
	public static WebDriver driver=new FirefoxDriver();
	
	 

}
