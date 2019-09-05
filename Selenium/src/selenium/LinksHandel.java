package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinksHandel extends BaseClass{
	public static void main(String[] args) throws MalformedURLException, IOException {
		driver.get("https://www.youtube.com");
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activelinks=new ArrayList<WebElement>();
		
		System.out.println("size of all links and images"+linkslist.size());
		
		for(int i=0;i<linkslist.size();i++) {
			if(linkslist.get(i).getAttribute("href") !=null) {
				activelinks.add(linkslist.get(i));
			}
			
		}
		//SIZE of active links and images
		System.out.println("size of active links and image---->"+activelinks.size());
		
		//check the href  url,with  httpconnection
		for(int j=0;j<activelinks.size();j++) {
			HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String responseMessage = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href")+"----->"+responseMessage);
		}
	}

}
