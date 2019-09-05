package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class HandelingAlartPopup extends BaseClass {
public static void main(String[] args) {
	driver.get("https://www.rediff.com/");
	driver.findElement(By.xpath("//a[@href=\"https://mail.rediff.com/cgi-bin/login.cgi\"][text()='Sign in']")).click();
	driver.findElement(By.name("proceed")).click();
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	
	alert.accept();
	
	if(text.equals("Please enter a valid user name")) {
		System.out.println("alerts message is ok");
	}else
	{
		System.out.println("alerts message is not ok");
	}
	
	
}
	
	
}
