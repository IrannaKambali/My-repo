package selenium;

import org.openqa.selenium.By;

public class Alert extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		//validate the alert message is correct or not  ?
		String actText = alert.getText();
		String excText="Are you sure you want to give us the deed to your house?";
		if(actText.equals(excText))
			System.out.println("yes");
		else
			System.out.println("No");
	}

}
