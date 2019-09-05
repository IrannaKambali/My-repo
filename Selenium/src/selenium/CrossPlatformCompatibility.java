package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossPlatformCompatibility 
{
@Test
public void runInMultipleOs() throws MalformedURLException {
	URL whichSystem=new URL("https://localhost:4444/wd/hub");
	DesiredCapabilities whichBrowser=new DesiredCapabilities();
	whichBrowser.setBrowserName("firefox");
	new RemoteWebDriver(whichSystem,whichBrowser);
}

}
