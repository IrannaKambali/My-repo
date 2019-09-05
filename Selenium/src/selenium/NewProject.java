package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java class\\Selenium\\Seleniumdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		String webtitle = driver.getTitle();
		System.out.println(webtitle);
		if (webtitle.equals("google")) {
			driver.close();
		}
		else {
			System.out.println("title is mathcing");
			
		}
		
		
		
		
		
		
	}
}
		
