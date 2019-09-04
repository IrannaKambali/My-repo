package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public class BaseTest implements IAutoConstant {
	public  WebDriver driver;
	static {
		//set the path of all three browser executable
		System.setProperty(GECKO_KEY, GECKO_PATH);
		System.setProperty(CHROME_KEY, CHROME_PATH);
		System.setProperty(IE_KEY, IE_PATH);
	}
	@BeforeMethod
	public void openApplication() {
		//launch the browser
			driver= new ChromeDriver();
		 //enter the url
		 driver.get(Lib.getPropertyValue("URL"));
		 //enter the TimeOut
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}
	@AfterMethod
	public void closeApplication(ITestResult res) {
		//close the browser
		
		if(ITestResult.FAILURE==res.getStatus())
		{
			Lib.capatureScreenshot(driver, res.getName());
		}
		driver.close();
		
	}

}
