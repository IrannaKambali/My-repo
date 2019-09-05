package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBoxwithSelectClass extends BaseClass
{
public static void main(String[] args) throws InterruptedException 
{
	driver.get("file:///C:/Users/sadyojatha/Desktop/ListBox.html");
	WebElement listBox=driver.findElement(By.id("mtr"));
	Select s =new Select(listBox);
	boolean multiple=s.isMultiple();
	if(multiple)
	{
		System.out.println("List of Box is Multiple Select");
	}else
	{
		System.out.println("List of Box is Single  Select");
	}
	System.out.println("******Total Options Present in the list box is\n******");
	List<WebElement> allOptions=s.getOptions();
	System.out.println(allOptions.size());
	System.out.println("****Options are\n******");
	for(WebElement option : allOptions)
	{
		System.out.println(option.getText());
	}
	System.out.println("*****Select IDLY,DOSA AND PURI******");
	s.selectByIndex(0);//Idly
	Thread.sleep(2000);
	s.selectByValue("d");//Dosa
	Thread.sleep(2000);
	s.selectByVisibleText("PURI");//Both puri will be selected
	Thread.sleep(2000);
	System.out.println(" *****Total Option Selected are \n****");
	List<WebElement> allSelectedOptions=s.getAllSelectedOptions();
	System.out.println(allSelectedOptions.size());
	System.out.println("****Selected Options are below \n*****");
	Iterator<WebElement> itr=allSelectedOptions.iterator();
	while(itr.hasNext())
	{
		WebElement option=itr.next();
		System.out.println(option.getText());
	}
	System.out.println("*******First Selected option in the list box is \n****");
	WebElement firstSelectedOption=s.getFirstSelectedOption();
	System.out.println("First selected Option is "+firstSelectedOption.getText());
	System.out.println("******Deselect IDLY **********");
	s.deselectByIndex(0);
	System.out.println("First Selected Option is "+firstSelectedOption.getText());
	System.out.println("First Selected Option is "+s.getFirstSelectedOption().getText());
	s.deselectAll();
	
	//driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
