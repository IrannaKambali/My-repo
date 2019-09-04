package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;

import pompages.HomePage;
import pompages.LoginPage;

public class ValidHomePage extends BaseTest{
	@Test
	public void testValidHomePage() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		login.setUsername(username);
		//enter password -manager
		String pwd = Lib.getCellValue("ValidLogin", 1, 1);
		login.setPassword(pwd);
		//click on login
		login.clickLogin();
		Thread.sleep(6000);
		HomePage hp=new HomePage(driver);
		//click on help link
		hp.clickHelpBtn();
		//click on About link
		hp.clickAboutActtimeLink();
		Thread.sleep(2000);
		//get text
	String actual =	hp.getActiTimeVerstion();
	
		//get expected result from excel
		String expectedResult = Lib.getCellValue("ExpectedResult", 1, 0);
		System.out.println(expectedResult);
		
		System.out.println(actual);
	Assert.assertEquals(actual, expectedResult);
		
	}


}
