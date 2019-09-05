package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserCompitability 
{
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver","E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","E:\\java class\\Selenium\\Seleniumdriver\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver","E:\\java class\\Selenium\\Seleniumdriver\\IEDriverServer.exe");
	}
	@Parameters("browser")
	@Test
public  void runInMultipleBrowser(String browser) throws InterruptedException {
		
		System.out.println(browser);
		if(browser.equals("firefox")) {
			 driver=new FirefoxDriver();
		} else if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}else {
			
			driver=new InternetExplorerDriver();
		}
	
	
	driver.get("http://demo.actitime.com/login.do");
	WebElement unTB = driver.findElement(By.id("username"));
	for(int i=1;i<=4;i++)
	{
		unTB.sendKeys("admin---->"+i);
		Thread.sleep(3000);
		unTB.clear();
		
	}
	driver.close();
	
}
}
