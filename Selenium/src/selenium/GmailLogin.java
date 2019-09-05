package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.ui.Robot;

public class GmailLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://mail.google.com");
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("iranna.s.kambali@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector("#password")).sendKeys("8105613323");
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("8105613323");
		driver.findElement(By.xpath("//*[@id=\"next\"]/content/span")).click();
		//driver.findElement(By.cssSelector("#passwordNext > div.ZFr60d.CeoRYc")).click();
	}

}
