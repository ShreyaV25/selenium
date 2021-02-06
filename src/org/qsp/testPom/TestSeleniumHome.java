package org.qsp.testPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.qsp.pom.SeleniumHome;

public class TestSeleniumHome 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		SeleniumHome sh = new SeleniumHome(driver);
		sh.sendText("java");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		sh.sendText("testng");
		Thread.sleep(2000);
		driver.close();
	}
}
