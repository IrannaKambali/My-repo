package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SlabLoginTest  extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\Selenium\\Seleniumdriver\\geckodriver.exe");
		driver.get("http://18.224.140.205/supplierLogin");
		WebElement emaiTb=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		emaiTb.sendKeys("prasanna@gamasome.com");
		
		WebElement pwdTb=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pwdTb.sendKeys("Password123!");
		
		
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		
	WebElement robprtCheckBox=driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border"));
		action.moveToElement(robprtCheckBox).perform();
	
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-block\"]")).click();
		
		String actualTitel=driver.getTitle();
		String expectedTitel="Slab Trade-Dashboard";
		if(actualTitel.contains(expectedTitel)) 
			
			System.out.println("Login page displayed");
			else 
			System.out.println("Login page not displayed");
		
		
	}

}
