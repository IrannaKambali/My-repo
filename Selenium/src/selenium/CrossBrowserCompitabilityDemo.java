package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserCompitabilityDemo  
{
	WebDriver driver;
	static {
		//set the path
		System.setProperty("webdriver.chrome.driver","E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe" );
		System.setProperty("webdriver.Firfox.driver","E:\\java class\\Selenium\\Seleniumdriver\\geckodriver.exe" );
		System.setProperty("webdriver.ie.driver","E:\\java class\\Selenium\\Seleniumdriver\\IEDriverServer.exe" );
	}
	@Parameters("browser")
	@Test
public void runInMultipleBrowsers(String browser) throws InterruptedException {
		System.out.println(browser);
		if(browser.equals("firfox"))
		{
			driver=new FirefoxDriver();
		}else 
		
			if(browser.equals("chrome")) {
				driver=new ChromeDriver();
			}else
				if(browser.equals("ie")) {
					driver=new InternetExplorerDriver();
				}
			
		
		driver.get("http://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		for(int i=1;i<=5;i++)
		{
			unTB.sendKeys("admin----->"+i);
			Thread.sleep(2000);
			unTB.clear();
			driver.close();
		}
		
		
		
		
	}
	
	
	
	
}
