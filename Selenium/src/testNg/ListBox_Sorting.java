package testNg;

import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.BaseClass;

public class ListBox_Sorting extends BaseClass {
	
		public static void main(String[] args) throws InterruptedException {		driver.get("file:///C:/Users/sadyojatha/Desktop/ListBox.html");
				WebElement listElement = driver.findElement(By.id("mtr"));
				Select s = new Select(listElement);
				java.util.List<WebElement> allOptions = s.getOptions();
				int count = allOptions.size();
				System.out.println(count);
				System.out.println("-----print the values in the list ----");
				ArrayList<String> list = new ArrayList<String>();
				for (WebElement option : allOptions) {
					String text = option.getText();
					System.out.println(text);
					list.add(text);
				}
				Collections.sort(list);
				System.out.println("-----print the value in sorted order----");
				for (String value : list) {
					System.out.println(value); 
		}}}


