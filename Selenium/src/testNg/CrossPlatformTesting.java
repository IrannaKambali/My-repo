package testNg;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossPlatformTesting 
{
	@Parameters({"node","browser"})
	@Test
	public void runInMultipleOS(String node,String browser) throws MalformedURLException, InterruptedException {
		URL whichSystem=new URL(node);
		DesiredCapabilities whichBrowser=new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(whichSystem,whichBrowser);
		driver.get("http://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		for(int i=1;i<=2;i++)
		{
			unTB.sendKeys("admin---->"+i);
			Thread.sleep(3000);
			unTB.clear();
			
		}
		driver.close();
		
	}

		
	}
	


