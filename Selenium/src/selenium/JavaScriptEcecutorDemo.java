package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptEcecutorDemo extends BaseClass
{
	public static void main(String[] args) throws InterruptedException
	{
		driver.get("http://demo.actitime.com/login.do");
		//enter username
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('username').value='admin'");
		//Enter the Password
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		//click on login button
		WebElement loginTb=driver.findElement(By.xpath("//div[text()='Login ']"));
		jse.executeScript("arguments[0].click()",loginTb );
		System.out.println("Sucessfully Loggeding");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
