package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

public class Amazo extends BaseClass {
	public static void main(String[] args) {

		driver.get("https://www.amazon.in/?ie=UTF8&tag=missing_dimension&ascsubtag=_k_CjwKCAjw1_PqBRBIEiwA71rmtRwFUSwdJZLsAdbKYCxWds5WAr1s4YvbplRPuaL7jiM731xKILWtPRoCOQsQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjw1_PqBRBIEiwA71rmtRwFUSwdJZLsAdbKYCxWds5WAr1s4YvbplRPuaL7jiM731xKILWtPRoCOQsQAvD_BwE");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi 7");
		driver.findElement(By.xpath("//input[@type=\"submit\"][@class=\"nav-input\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"Redmi 7 (Comet Blue, 2GB RAM, 32GB Storage)\"]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.getClass().getName());
//		ArrayList<String> al = new ArrayList<>();
//		al.addAll(windowHandles);
//		driver.switchTo().window(al.get(1));
//		driver.findElement(By.id("add-to-cart-button")).click();
//		driver.findElement(By.id("nav-cart-count")).click();
		
		//driver.quit();
		
	}
	
	
	
	
	
	
	

}
