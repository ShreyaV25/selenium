package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider 
{
	@DataProvider
	public static String[][] demo()
	{
		String[][] str = new String[3][2];
		str[0][0] = "UserA";
		str[0][1] = "A";
		str[1][0] = "UserC";
		str[1][1] = "C";
		str[2][0] = "UserB";
		str[2][1] = "B";
		return str;
	}
	
	@Test(dataProvider = "demo")
	public void tc(String user, String pass)
	{
		Reporter.log(user+" "+pass,true);
	}
}
