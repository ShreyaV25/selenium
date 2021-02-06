package Demo.testngDemo.qsp;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoCross 
{
	@Parameters("browser")
	@Test
	private void TC1(String browser) throws InterruptedException 
	{
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			driver = null;
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
	}
}
