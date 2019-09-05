package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FbListBoxAssinment  extends BaseClass
{
public static void main(String[] args) throws InterruptedException {
	driver.get("https://www.facebook.com/");
	WebElement firatName=driver.findElement(By.id("u_0_j"));
	firatName.sendKeys("iranna");
	Thread.sleep(2000);
	WebElement lastName = driver.findElement(By.id("u_0_l"));
	lastName.sendKeys("kambali");
	Thread.sleep(2000);
	WebElement mobileNumber = driver.findElement(By.id("u_0_o"));
	mobileNumber.sendKeys("9632451015");
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.id("u_0_v"));
	password.sendKeys("8050669003");
	Thread.sleep(2000);
	WebElement birthDay = driver.findElement(By.id("day"));
	Select s1=new Select(birthDay);
	s1.selectByValue("15");
	Thread.sleep(2000);
	WebElement birthMonth=driver.findElement(By.id("month"));
	Select s2=new Select(birthMonth);
	s2.selectByIndex(8);
	Thread.sleep(2000);
	WebElement birthYear = driver.findElement(By.id("year"));
	Select s3=new Select(birthYear);
	s3.selectByVisibleText("1992");
	Thread.sleep(2000);
	WebElement genderObj = driver.findElement(By.id("u_0_a"));
	genderObj.click();
	WebElement signupObj = driver.findElement(By.id("u_0_11"));
	signupObj.click();
	System.out.println("FaceBook SignUp");
	System.out.println("Welcome To FaceBook");
	
	driver.close();
	
	
	
}
}
