package selenium;

import org.openqa.selenium.By;

public class Gmail extends BaseClass
{
public static void main(String[] args) {
	driver.get("http://mail.google.com");
	String xp="//div[@class='vwtvsf']//div[@class='ck6P8']";
	driver.findElement(By.xpath(xp)).click();
}
}
