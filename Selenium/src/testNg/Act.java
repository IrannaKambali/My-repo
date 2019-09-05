package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.BaseClass;

public class Act extends BaseClass {
	public static void main(String[] args) {
		
		driver.get("http://demo.actitime.com/login.do");
		POMClassForActitimeLogin l=new POMClassForActitimeLogin(driver);
		
		l.setUsername("admin");
		l.setPassword("manager");
		l.click();
		
	}

}
