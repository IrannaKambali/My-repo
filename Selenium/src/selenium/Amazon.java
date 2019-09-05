package selenium;

import org.openqa.selenium.By;

public class Amazon extends BaseClass {
	public static void main(String[] args) {
		
		driver.get("https://www.amazon.com/ref=nav_logo");
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung s8");
		driver.findElement(By.xpath("//*[@id=\"asin-shoveler-ns_29PB5K0V5ENPGGWEVYH4_14_\"]/div[2]/div/ul/li[3]/span/a/img")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		
		
		
	}

}
