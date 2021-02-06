import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleClear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement value = driver.findElement(By.xpath("//input[@title='Search']"));
		System.out.println(value.getAttribute("value"));
		value.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("TestNG",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
}
