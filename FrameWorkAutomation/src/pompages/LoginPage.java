package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
@FindBy(name="username")
WebElement unTB;

@FindBy(name="pwd")
WebElement pwdTB;

@FindBy(xpath="//div[text()='Login ']")
WebElement loginBtn;

//Initialize the elements
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//Utilize the elements
public void setUsername(String un)
{
	unTB.sendKeys(un);
}

public void setPassword(String pwd)
{
	pwdTB.sendKeys(pwd);
}

public void clickLogin()
{
	loginBtn.click();
}


}
