import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(3000);
		List<WebElement> menus = driver.findElements(By.xpath("//a[text()='All Jewellery ']"));
		Actions a = new Actions(driver);
		for (WebElement menusName : menus) 
		{
			//String mName = menusName.getText();
			//System.err.println(mName);
			a.moveToElement(menusName).build().perform();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='The Udith Kada For Him']")).click();
		for (String kada : driver.getWindowHandles())
		{
			driver.switchTo().window(kada);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@name='chainselect']")).click();
		driver.findElement(By.xpath("//span[text()='2-2(2 2/16\")']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		String title = driver.findElement(By.xpath("//a[text()='The Udith Kada For Him']")).getText();
		System.out.println(title);
		driver.close();
		
	}
}
