package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	@Test(priority = 2)//run this first
	public void tc1() 
	{
		Reporter.log("1Hey....!", true);
	}
	
	@Test(enabled = false)//to stop excution of test case
	public void tc2() 
	{
		Reporter.log("2Hey....!", true);
	}
	
	@Test(priority = -2)
	public void tc3() 
	{
		Reporter.log("3Hey....!", true);
	}
	
	@Test(invocationCount = 0)//to stop excution of test case another way
	public void tc4() 
	{
		Reporter.log("4Hey....!", true);
	}
	
	@Test(dependsOnMethods = {"tc1","tc3"})
	public void tc5() 
	{
		Reporter.log("3Hey....!", true);
	}
}
