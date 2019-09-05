package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadDemo extends BaseClass
{
public static void main(String[] args) {
	driver.get("https://www.naukri.com");
	WebElement upLoadCVObj = driver.findElement(By.id("input_resumeParser"));
	upLoadCVObj.sendKeys("\"C:\\Users\\sadyojatha\\Downloads\\campagin.pdf\""
			+ "");
	
}
}
