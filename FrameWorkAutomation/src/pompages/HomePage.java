package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/div/div[3]/div/div[1]/div")
	WebElement helpBtn;
	
	@FindBy(xpath="//a[text()='About your actiTIME']")
	WebElement AboutActitimeLink;
	
	@FindBy(xpath="//span[text()='actiTIME 2019.2 Pro']")
	WebElement actualText;
	
	@FindBy(id="aboutPopupCloseButtonId")
	WebElement clickCancelBtn;
	
	//initialize
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	public void clickHelpBtn()
	{
		helpBtn.click();
	}
	
	public void clickAboutActtimeLink()
	{
		AboutActitimeLink.click();
	}
	public String getActiTimeVerstion(){
		return actualText.getText();
		
	}
	public void clickCancelButton() {
		clickCancelBtn.click();
	}

}
