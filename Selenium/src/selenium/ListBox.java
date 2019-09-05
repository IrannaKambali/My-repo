package selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;

public class ListBox extends BaseClass
{
public static void main(String[] args)
{
	driver.get("file:///C:/Users/sadyojatha/Desktop/ListBox.html");
	WebElement listBox=driver.findElement(By.id("mtr"));
	List<WebElement> allOptions=driver.findElements(By.tagName("option"));
   int count1 = allOptions.size();
   System.out.println("Number of elements in the list is :" +count1);
   int selectedCount=0;
   
   int Deselectedcount=0;
   for(WebElement option: allOptions)
   {
	System.out.println(option.getText());
	option.click();
	if(option.isSelected())
		selectedCount++;
	option.click();
	if(option.isSelected())
		Deselectedcount++;
		
  
}
   
   System.out.println("selected option count : "+selectedCount);//5
 System.out.println("deselected option count"+Deselectedcount);  
}
}


