package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime
{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\java class\\Selenium\\Seleniumdriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.actitime.com/login.do");
	//username text box x-coordinate
	WebElement unTB=driver.findElement(By.id("username"));
    System.out.println("Username text box x-coordinate "+unTB.getLocation().getX());
	//username text box y-coordinate
    System.out.println("Username text box x-coordinate "+unTB.getLocation().getY());
    //username text box Hight
    System.out.println("Username text box x-coordinate "+unTB.getSize().getHeight());
    //username text bot width
    System.out.println("Username text box x-coordinate "+unTB.getSize().getWidth());
    //validation for tooltip
    String ExpectedToolTipMsg=("Do not select if this computer is shared");
    WebElement CheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
    String ActToolTipMsg=CheckBox.getAttribute("title");
    if(ActToolTipMsg.equals(ExpectedToolTipMsg))
    
    	System.out.println("Tool Tip Msg is Valid");
    	else
    	System.out.println("Tool Tip Msg is not Valid");
    //validation for version
    String ExpVer="actiTIME 2019.1 Pro";
    WebElement Ver=driver.findElement(By.xpath("//nobr[contains (text(),actiTIME)]"));
    String ActVer=Ver.getText();
    if(ActVer.equals(ExpVer))
    	System.out.println("Displayed version is valid");
    else
    	System.out.println("Displayed version is Invalid");
    
    
    
    
}
}
