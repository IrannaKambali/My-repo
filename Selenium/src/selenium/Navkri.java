package selenium;

import java.util.ArrayList;
import java.util.Set;

public class Navkri extends BaseClass{
	public static void main(String[] args) {
		
	
	driver.get("https://www.naukri.com/");
	Set<String> hand = driver.getWindowHandles();
	ArrayList<String> list =new ArrayList<String>(hand);
	list.addAll(hand);
//	for (int i =list.size()-1; i>=0; i--) {
//		driver.switchTo().window(list.get(i));
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.close();
//	}
	
	for (int i = 0; i < list.size()-1; i++) {
		System.out.println(driver.switchTo().window(list.get(i)).getTitle());
	}
	System.out.println(hand.size());
}
}