package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class TrialBrowser {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\java class\\Selenium\\Seleniumdriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Titel of fb ="+driver.getTitle());
		System.out.println("Titel of fb ="+driver.getCurrentUrl());
		driver.close();

		Navigation nav=driver.navigate();
		nav.to("http//:www.google.com");
	}

}

