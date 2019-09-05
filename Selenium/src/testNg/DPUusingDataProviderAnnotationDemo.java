package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPUusingDataProviderAnnotationDemo
{
	@DataProvider()
	public Object[][] dataBank(){
		Object[][] data=new Object[3][3];
		data[0][0]="admin";
		data[0][1]="manager1";
		data[0][2]="manager1";
		
		data[1][0]="admin";
		data[1][1]="manager1";
		data[1][2]="manager1";
		
		data[2][0]="admin";
		data[2][1]="manager1";
		data[2][2]="manager1";
		return data;
		
	}
@Test(dataProvider="dataBank")
public void testLogin(String username,String password,String confirmpassword) {
	
}

}
