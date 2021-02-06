import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		/*
		Thread.sleep(30000);
		driver.findElement(By.partialLinkText("Inc.")).click();
		Set<String> wins = driver.getWindowHandles();
		for (String win : wins) 
		{
			driver.switchTo().window(win);
		}
		System.out.println(driver.getTitle());
		*/
		Thread.sleep(20000);
		WebElement userName = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		System.out.println(userName.getText());
		
		WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println(password.getText());
		
		driver.findElement(By.xpath("//input[contains(@name,\"username\")]")).sendKeys(userName.getText());
		driver.findElement(By.xpath("//input[contains(@name,\"pwd\")]")).sendKeys(password.getText());
		
		driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
		
		
	}
}
