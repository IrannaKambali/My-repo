package testNg;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.BaseClass;

public class PrintUniqueElementinthelistbox extends BaseClass
{
public static void main(String[] args) {
	driver.get("file:///C:/Users/sadyojatha/Desktop/ListBox.html");
	
	WebElement listElement = driver.findElement(By.id("mtr"));
	Select s=new Select(listElement);
	List<WebElement> allOptions = s.getOptions();
	int count = allOptions.size();
	System.out.println(count);
	System.out.println("Print the values in list");
	HashSet<String>allElement=new HashSet<String>();
	for(WebElement option : allOptions) {
		String text = option.getText();
	System.out.println(text);
	allElement.add(text);
	}
	System.out.println(allElement);
	System.out.println("-----print the value in sorted order----");
	for (String value : allElement) {
		System.out.println(value); 
}
}}
