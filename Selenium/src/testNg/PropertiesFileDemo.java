package testNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream configFileobj = new FileInputStream("./cofig.property");

		Properties prop = new Properties();
		prop.load(configFileobj);
		String url = prop.getProperty("USERNAME");
		System.out.println(url);
	}

}
