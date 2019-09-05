package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class REfer extends BaseClass
{
public static void main(String[] args) throws InterruptedException {
	driver.get("file:///C:/Users/sadyojatha/Desktop/ListBox.html");
	WebElement listBox=driver.findElement(By.id("mtr"));
	Select s=new Select(listBox);
	boolean multiple = s.isMultiple();
	if(multiple)
	{
		System.out.println(" List Of Box is Multiple ");
	}else
	{
		System.out.println(" List Of Box Is Single ");
	}
	System.out.println("****Total Options present in listbox is \n****");
	List<WebElement> allOptions = s.getOptions();
	System.out.println(allOptions.size());
	System.out.println("******Options are \n*******");
	for(WebElement option : allOptions)
	{
		System.out.println(option.getText());
	}
	System.out.println("**** Select Vada Puri Dosa ***** \n");
	s.selectByIndex(2);
	Thread.sleep(2000);
	s.selectByValue("p");
	Thread.sleep(2000);
	s.selectByVisibleText("DOSA");
	Thread.sleep(2000);
	System.out.println("*** Total Options Selected are *****\n");
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	System.out.println(allSelectedOptions.size());
	System.out.println(" Selected Options are below");
	for(WebElement allSeletedOption : allSelectedOptions)
	{
		System.out.println(allSeletedOption.getText());
	}
	System.out.println("First selected option in the list Box is");
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	Thread.sleep(2000);
	System.out.println("Deselect Vada");
	s.deselectByIndex(2);
	Thread.sleep(2000);
	System.out.println("First selected option is"+firstSelectedOption.getText());
	System.out.println( "First Selected option is "+s.getFirstSelectedOption().getText());
	s.deselectAll();
	
	
	
	
	
	
	
	
}
}
