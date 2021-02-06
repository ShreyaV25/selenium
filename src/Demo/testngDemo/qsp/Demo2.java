package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test(invocationCount = 5)//to run this test case multiple times
	public void tc()
	{
		//in real time we can't use syso below is use
		Reporter.log("Hey.....", true);
	}
}
