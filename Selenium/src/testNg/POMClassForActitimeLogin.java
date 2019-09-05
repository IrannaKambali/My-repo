package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassForActitimeLogin 
{
	
	
	//Declaration
	@FindBy(id="username")
	WebElement unTB;
	
	@FindBy(name="pwd")
	WebElement pwdTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	WebElement loginBtn;
	
	//Initialization
	public POMClassForActitimeLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUsername(String un) {
		unTB.sendKeys(un);
	}
		public void setPassword(String pwd) {
			pwdTB.sendKeys(pwd);
		}
		public void click() {
			loginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
