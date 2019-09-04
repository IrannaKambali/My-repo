package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {
	@Test
public void testValidLogin() throws InterruptedException
{
	//enter username -admin
	LoginPage login=new LoginPage(driver);
	String username = Lib.getCellValue("ValidLogin", 1, 0);
	login.setUsername(username);
	//enter password -manager
	String pwd = Lib.getCellValue("ValidLogin", 1, 1);
	login.setPassword(pwd);
	//click on login
	login.clickLogin();
	Thread.sleep(6000);
	//Assert.fail();
	
	String aHomePageTitle=driver.getTitle();
	if(aHomePageTitle.equals("Wrong page"))
	{
		System.out.println("Login successfull");
	}else {
		System.out.println("Login failed");
	}
	
}
	

}


